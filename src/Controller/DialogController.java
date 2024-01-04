package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/1/4 20:50
 */
public class DialogController {
    @FXML
    private TextField userName;

    @FXML
    private PasswordField password;

    @FXML
    private Button loginBtn;

    @FXML
    void userNameEnter(KeyEvent event) {
        if(event.getCode()== KeyCode.ENTER){
            password.requestFocus();
        }
    }

    @FXML
    void passwordEnter(KeyEvent event) {
        if(event.getCode()== KeyCode.ENTER){
            loginBtn.fire();
        }
    }
}