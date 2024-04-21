package forms;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class mainController {

    @FXML
    protected void btNovoAction (ActionEvent e) throws IOException{
        System.out.println("bt Novo");
        App.setRoot("details_screen");
    }
    
}
