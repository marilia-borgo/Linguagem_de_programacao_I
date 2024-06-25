package database_controllers;

import forms.Livro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class crudLivro {
    public static boolean insertBook(Livro livro) {
        boolean inserted = false;
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = DatabaseConnection.getConnection();
            if (connection != null) {
                String query = "INSERT INTO Books (titulo, autor, quantPaginas) VALUES (?, ?, ?)";
                statement = connection.prepareStatement(query);
                statement.setString(1, livro.getTitulo());
                statement.setString(2, livro.getAutor());
                statement.setInt(3, livro.getQuantPaginas());
                
                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Livro inserido com sucesso!");
                    inserted = true;
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir livro: " + e.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar conexão: " + e.getMessage());
            }
        }
        
        return inserted;
    }

    public static void updateBook(Livro livro) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = DatabaseConnection.getConnection();
            if (connection != null) {
                String query = "UPDATE Books SET titulo = ?, autor = ?, quantPaginas = ?,  WHERE titulo = ?";
                statement = connection.prepareStatement(query);
                statement.setString(1, livro.getTitulo());
                statement.setString(2, livro.getAutor());
                statement.setInt(3, livro.getQuantPaginas());
                statement.setString(4, livro.getTitulo());
                
                int rowsUpdated = statement.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Livro atualizado com sucesso!");
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar livro: " + e.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar conexão: " + e.getMessage());
            }
        }

    }
    public static void deleteBook(String titulo) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = DatabaseConnection.getConnection();
            if (connection != null) {
                String query = "DELETE FROM Books WHERE titulo = ?";
                statement = connection.prepareStatement(query);
                statement.setString(1, titulo);
                
                int rowsDeleted = statement.executeUpdate();
                if (rowsDeleted > 0) {
                    System.out.println("Livro deletado com sucesso!");
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao deletar livro: " + e.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar conexão: " + e.getMessage());
            }
        }
    }

   public static List<Livro> selectBook() {
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    List<Livro> books = new ArrayList<>();

    try {
        connection = DatabaseConnection.getConnection();
        if (connection != null) {
            String query = "SELECT * FROM Books";
            statement = connection.prepareStatement(query);
            
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Livro book = new Livro();
                book.setLivro(resultSet.getString("titulo"), resultSet.getString("autor"), resultSet.getInt("quantPaginas"));
                books.add(book);
            }
        }
    } catch (SQLException e) {
        System.out.println("Erro ao selecionar livro: " + e.getMessage());
    } finally {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Erro ao fechar conexão: " + e.getMessage());
        }
    }

    return books;
}
    
    
    public static void main(String[] args) {
        Livro book = new Livro();
        book.setLivro("Harry Potter", "j.k rowling", 100);
        
        List<Livro> inserted = crudLivro.selectBook();

        for (Livro livro : inserted) {
            System.out.println(livro.getTitulo());
            System.out.println(livro.getAutor());
            System.out.println(livro.getQuantPaginas());
        }
    }
}
