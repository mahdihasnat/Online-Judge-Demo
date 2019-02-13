/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineJudge.User;

import OnlineJudge.OnlineJudge;
import static OnlineJudge.OnlineJudge.Nodes;
import OnlineJudge.ProblemSet.ProblemShowFXMLController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MAHDI
 */
public class RegisterFXMLController implements Initializable {

    @FXML
    private TextField Handle;
    @FXML
    private TextField Email;
    @FXML
    private TextField Country;
    @FXML
    private TextField University;
    @FXML
    private PasswordField Password;
    @FXML
    private TextField Name;
    @FXML
    private Button SubmitButton;
    @FXML
    private Label PromptLavel;
    @FXML
    private Button LogInButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void RegisterAccount(ActionEvent event) {
        try {
            System.out.println("Submit button Clicked");
            PromptLavel.setText("");
            if (Name.getText().length() < 5) {
                PromptLavel.setText("Enter Valid Name");
                return;

            } else if (Handle.getText().length() < 5) {
                PromptLavel.setText("Enter Valid Handle");
                return;
            } else if (Email.getText().indexOf('@') == -1 || Email.getText().indexOf('.') == -1) {
                PromptLavel.setText("Enter Valid Email");
                return;
            } else if (Password.getText().length() < 7) {
                PromptLavel.setText("Enter Valid Password");
                return;
            }

            LocalUser.sendServer(new User(Name.getText(), Handle.getText(), Email.getText(), Country.getText(), University.getText(), Password.getText()));

            System.out.println("reg requert sent");
            PromptLavel.setText("Registration Request sent");
            Boolean rep = null;
            do {
                rep = (Boolean) LocalUser.read();
            } while (rep == null);
            if (rep) {
                PromptLavel.setText("Please wait for reply ");
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {

                        try {
                            Boolean rep = null;
                            do {
                                rep = (Boolean) LocalUser.read();
                            } while (rep == null);
                            System.out.println("Repa=  " + rep);
                            if (rep) {
                                System.out.println("reg success");
                                PromptLavel.setText("Registration mail sent");
                                FXMLLoader loader = new FXMLLoader(getClass().getResource("/OnlineJudge/User/VerificationFXML.fxml"));
                                Parent root = loader.load();
                                VerificationFXMLController controller = loader.getController();
                                controller.setMailaddress(Email.getText());
                                OnlineJudge.PrimaryStage.setScene(new Scene(root));
                            } else {
                                PromptLavel.setText("Invalid mail or error sending mail");

                            }
                        } catch (IOException ex) {
                            Logger.getLogger(ProblemShowFXMLController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });

            } else {
                PromptLavel.setText("Try Another Handle");
            }

        } catch (Exception ex) {
            System.out.println(ex.getCause());
            Logger.getLogger(RegisterFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void LogInButtonCreated(ActionEvent event) {
        System.out.println("Log In Button pressed");
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/OnlineJudge/User/LogInFXML.fxml"));

            Scene scene = new Scene(root, 720, 600);

            OnlineJudge.PrimaryStage.setScene(scene);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(-1);
        }

    }

}
