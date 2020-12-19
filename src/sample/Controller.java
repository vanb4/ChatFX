package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import static java.lang.System.lineSeparator;

public class Controller {
    @FXML
    TextField mainTextField;
    @FXML
    TextArea textArea;

    
        public void addTextToArea(ActionEvent actionEvent) {
            textArea.appendText(mainTextField.getText() + lineSeparator());
            mainTextField.setText("");
            mainTextField.requestFocus();

    }


}









