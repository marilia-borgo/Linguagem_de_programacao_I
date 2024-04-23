package forms;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import forms.Livro;

public class detailsController {
    @FXML
    private Text tTitulo;

    @FXML
    private Text tAutor;

    @FXML
    private Text tQuantPagina;

    @FXML
    private TextField tfTitulo;
    @FXML
    private TextField tfAutor;
    @FXML
    private TextField tfQuantPagina;


    @FXML
    protected void btOkAction (ActionEvent e) throws IOException{
        System.out.println("bt Novo");
        String titulo = tfTitulo.getText();
        tTitulo.setText(titulo);
        tfTitulo.setVisible(false);

        String autor = tfAutor.getText();
        tAutor.setText(autor);
        tfAutor.setVisible(false);

        String quantPaginas = tfQuantPagina.getText();
        tfQuantPagina.setVisible(false);

        Livro meuLivro = new Livro();
        int numero = Integer.parseInt(quantPaginas);
        meuLivro.setLivro(titulo, autor, numero);
        String abrir = meuLivro.abrir();
        tQuantPagina.setText(abrir);
        tQuantPagina.setVisible(true);

    }

    @FXML
    protected void pratoMudar (ActionEvent e) throws IOException{
        App.setRoot("prato");
    }

    @FXML
    protected void vaiProLivro (ActionEvent e) throws IOException{
        App.setRoot("details_screen");
    }

    @FXML
    protected void vaiProInseto (ActionEvent e) throws IOException{
        App.setRoot("inseto");
    }
    
}
