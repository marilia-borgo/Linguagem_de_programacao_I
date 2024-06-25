package forms;

import forms.Livro;
import database_controllers.crudLivro;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class detailsController {

    @FXML
    private TableView<Livro> bookTable;
    @FXML
    private TableColumn<Livro, String> tituloColumn;
    @FXML
    private TableColumn<Livro, String> autorColumn;
    @FXML
    private TableColumn<Livro, Integer> quantPaginasColumn;
    @FXML
    private TextField tituloField;
    @FXML
    private TextField autorField;
    @FXML
    private TextField quantPaginasField;

    private ObservableList<Livro> bookData = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        tituloColumn.setCellValueFactory(new PropertyValueFactory<>("titulo"));
        autorColumn.setCellValueFactory(new PropertyValueFactory<>("autor"));
        quantPaginasColumn.setCellValueFactory(new PropertyValueFactory<>("quantPaginas"));

        loadBooksFromDatabase();

        bookTable.setItems(bookData);
    }

    @FXML
    private void handleAddBook() {
        Livro newBook = new Livro();
        newBook.setLivro(tituloField.getText(), autorField.getText(), Integer.parseInt(quantPaginasField.getText()));
        if (crudLivro.insertBook(newBook)) {
            bookData.add(newBook);
            clearFields();
        }
    }

    @FXML
    private void handleUpdateBook() {
        Livro selectedBook = bookTable.getSelectionModel().getSelectedItem();
        if (selectedBook != null) {
            selectedBook.setLivro(tituloField.getText(), autorField.getText(), Integer.parseInt(quantPaginasField.getText()));
            crudLivro.updateBook(selectedBook);
            bookTable.refresh();
            clearFields();
        }
    }

    @FXML
    private void handleDeleteBook() {
        Livro selectedBook = bookTable.getSelectionModel().getSelectedItem();
        if (selectedBook != null) {
            crudLivro.deleteBook(selectedBook.getTitulo());
            bookData.remove(selectedBook);
        }
    }

    private void loadBooksFromDatabase() {
        bookData.clear();
        bookData.addAll(crudLivro.selectBook());
    }

    private void clearFields() {
        tituloField.clear();
        autorField.clear();
        quantPaginasField.clear();
    }
}
