package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/1/4 16:48
 */
public class RegisterController {
    @FXML
    private TextField phoneText;

    @FXML
    private PasswordField passwordText;

    @FXML
    private RadioButton btnFemale;

    @FXML
    private PasswordField rePasswordText;

    @FXML
    private TextField nameText;

    @FXML
    private TextField idText;

    @FXML
    private RadioButton btnMale;

    @FXML
    private TextField safeCodeText;

    @FXML
    void enterId(KeyEvent event) {
        if(event.getCode()== KeyCode.ENTER){
            nameText.requestFocus();
        } else {
            System.out.println(event);
        }
    }

    @FXML
    void enterName(KeyEvent event) {
        if(event.getCode()== KeyCode.ENTER){
            passwordText.requestFocus();
        } else {
            System.out.println(event);
        }
    }

    @FXML
    void maleBtnPressed(KeyEvent event) {
        if(event.getCode()== KeyCode.ENTER){
            phoneText.requestFocus();
        } else if (event.getCode()== KeyCode.RIGHT) {
            btnFemale.requestFocus();
        }
    }

    @FXML
    void femaleBtnPressed(KeyEvent event) {
        if(event.getCode()== KeyCode.ENTER){
            phoneText.requestFocus();
        } else if (event.getCode()== KeyCode.LEFT) {
            btnMale.requestFocus();
        }
    }

    @FXML
    void enterPhone(KeyEvent event) {
        if(event.getCode()==KeyCode.ENTER){
            safeCodeText.requestFocus();
        }
    }

    @FXML
    void enterPassword(KeyEvent event) {
        if(event.getCode()== KeyCode.ENTER){
            rePasswordText.requestFocus();
        } else {
            System.out.println(event);
        }
    }

    @FXML
    void reEnterPassword(KeyEvent event) {
        if((event.getCode()== KeyCode.ENTER)){
            btnMale.requestFocus();
        }
    }
}
