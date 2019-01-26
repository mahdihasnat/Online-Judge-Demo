/* ....Show License.... */
package OnlineJudge.User;

import OnlineJudge.OnlineJudge;
import Server.LoginRequest;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

/**
 * Login Controller.
 */
public class LogInFXMLController extends AnchorPane implements Initializable {

    @FXML
    Button login;
    @FXML
    Label Message;
    @FXML
    private Button BackButon;
    @FXML
    private Button RegisterButton;
    @FXML
    private TextField Handle;
    @FXML
    private PasswordField Password;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Message.setText("");

    }

    @FXML
    private void RegisterButtonClicked(ActionEvent event) {
        System.out.println("Register Button Clicked");
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/OnlineJudge/User/RegisterFXML.fxml"));

            Scene scene = new Scene(root, 720, 600);

            OnlineJudge.PrimaryStage.setScene(scene);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    @FXML
    private void HomeButtonClicked(ActionEvent event) {
        System.out.println("Home  Button pressed");
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/OnlineJudge/OnlineJudgeFXML.fxml"));

            Scene scene = new Scene(root, 720, 600);

            OnlineJudge.PrimaryStage.setScene(scene);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    @FXML
    private void LogInButtonClicked(ActionEvent event) {
        try {
            String username= Handle.getText();
            String password= Password.getText();
            if (Handle.getText().equals("") && Password.getText().equals("")) {
                Password.setText("admin");
                Handle.setText("admin");
            }
            
            if (Handle.getText().equals("admin") && Password.getText().equals("admin")) {
                LocalUser.setAdmin();
                System.out.println("Log in successful");
                try {
                    Parent root = FXMLLoader.load(getClass().getResource("/OnlineJudge/User/UserFXML.fxml"));
                    
                    Scene scene = new Scene(root, 720, 600);
                    
                    OnlineJudge.PrimaryStage.setScene(scene);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    
                }
            }
            Message.setText("Waiting ... .... ... ");
            
            LocalUser.getOos().writeObject(new LoginRequest(username, password));
            LocalUser.getOos().flush();
            
            Object obj=    LocalUser.getOis().readObject();
            if(obj instanceof  Boolean)
            {
                Boolean rep= (Boolean)obj;
                if(rep)
                {
                    System.out.println("Log in ok");
                    
                    
                    
                }
                else 
                {
                    Message.setText("Wrong username/password");
                }
            }
            
        } catch (Exception ex) {
            Logger.getLogger(LogInFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
