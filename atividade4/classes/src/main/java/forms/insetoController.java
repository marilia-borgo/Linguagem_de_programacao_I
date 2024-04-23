package forms;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import forms.Inseto;


public class insetoController {
    @FXML
    private Text tCor;

    @FXML
    private Text tNome;

    @FXML
    private Text tAsas;

    @FXML
    private TextField tfCor;
    @FXML
    private TextField tfNome;
    @FXML
    private TextField tfAsas;


    @FXML
    protected void insetoclasse (ActionEvent e) throws IOException{
        String cor = tfCor.getText();
        tfCor.setVisible(false);

        String nome = tfNome.getText();
        tfNome.setVisible(false);

        String asas = tfAsas.getText();
        tfAsas.setVisible(false);

        Inseto meuInseto = new Inseto();
        meuInseto.setInseto(cor, nome, asas);
        String voar = meuInseto.voar();

        tAsas.setText(voar);
        tAsas.setVisible(true);
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
