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
 * @time: 2024/1/4 17:57
 */
public class ForgetController {
    @FXML
    private TextField phoneText;

    @FXML
    private TextField safeCodeText;

    @FXML
    private PasswordField passwordText;

    @FXML
    private PasswordField rePasswordText;

    @FXML
    private TextField accountText;

    @FXML
    private TextField nameText;

    @FXML
    private Button resetBtn;

    @FXML
    void accountEnter(KeyEvent event) {
        if(event.getCode()== KeyCode.ENTER){
            nameText.requestFocus();
        }
    }

    @FXML
    void phoneEnter(KeyEvent event) {
        if(event.getCode()== KeyCode.ENTER){
            safeCodeText.requestFocus();
        }
    }

    @FXML
    void nameEnter(KeyEvent event) {
        if(event.getCode()== KeyCode.ENTER){
            phoneText.requestFocus();
        }
    }

    @FXML
    void passwordEnter(KeyEvent event) {
        if(event.getCode()== KeyCode.ENTER){
            rePasswordText.requestFocus();
        }
    }

    @FXML
    void rePasswordEnter(KeyEvent event) {
        if(event.getCode()== KeyCode.ENTER){
            resetBtn.fire();
        }
    }

    @FXML
    void safeCodeEnter(KeyEvent event) {
        if(event.getCode()== KeyCode.ENTER){
            passwordText.requestFocus();
        }
    }
}
