/* ....Show License.... */
package OnlineJudge.User;
 
import OnlineJudge.OnlineJudge;
import java.net.URL;
import java.util.ResourceBundle;
 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
 
/**
 * Login Controller.
 */
public class LogInFXMLController extends AnchorPane implements Initializable {
 
    @FXML
    TextField userId;
    @FXML
    PasswordField password;
    @FXML
    Button login;
    @FXML
    Label errorMessage;
    @FXML
    private Hyperlink RegisterLink;
 
 
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        errorMessage.setText("");
        userId.setPromptText("tourist");
        password.setPromptText("******");
 
    }
 
 
    @FXML
    public void processLogin(ActionEvent event) {
        
    }

    @FXML
    private void RegisterButtonClicked(ActionEvent event) {
    }
}