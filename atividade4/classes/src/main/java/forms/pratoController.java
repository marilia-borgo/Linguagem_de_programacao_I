package forms;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import forms.Prato;

public class pratoController {
    @FXML
    private Text tFormato;

    @FXML
    private Text tCor;

    @FXML
    private Text tRaso;

    @FXML
    private TextField tfFormato;
    @FXML
    private TextField tfCor;
    @FXML
    private TextField tfRaso;


    @FXML
    protected void btOkAction (ActionEvent e) throws IOException{
        String formato = tfFormato.getText();
        tFormato.setText(formato);
        tfFormato.setVisible(false);

        String cor = tfCor.getText();
        tCor.setText(cor);
        tfCor.setVisible(false);

        String raso = tfRaso.getText();
        tfRaso.setVisible(false);

        Prato meuPrato = new Prato();
        meuPrato.setPrato(formato, cor, raso);
        String colocar_comida = meuPrato.colocar_comida();
        tRaso.setText(colocar_comida);
        tRaso.setVisible(true);
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
