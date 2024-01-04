package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/1/4 21:04
 */
public class mainWindowController {
    @FXML
    private Button exitBtn;

    @FXML
    private TextField inputText;

    @FXML
    private Button sendBtn;

    @FXML
    void inputEnter(KeyEvent event) {
        if(event.getCode() == KeyCode.ESCAPE) {
            exitBtn.fire();
        } else{
            if(event.getCode() == KeyCode.ENTER){
                sendBtn.fire();
            }
        }
    }
}
