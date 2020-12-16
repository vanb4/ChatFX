package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

public class Controller {
    @FXML
    TextField mainTextField;
    @FXML
    TextArea textArea;

 /*   public void sendButtonClick(ActionEvent actionEvent) {
        mainTextField.setText(((Button) actionEvent.getSource()).getText());
    }*/


    public void addTextToArea(ActionEvent actionEvent) {
        textArea.appendText(mainTextField.getText());

    }
}









