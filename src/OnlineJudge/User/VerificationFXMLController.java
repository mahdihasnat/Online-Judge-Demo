/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineJudge.User;

import OnlineJudge.OnlineJudge;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author MAHDI
 */
public class VerificationFXMLController implements Initializable {
    private String mailaddress;
    
    @FXML
    private Label MailAddress;
    @FXML
    private TextField VerificationCode;
    @FXML
    private Label ErrorMessage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void BackButtonClicked(ActionEvent event) {
    }

    @FXML
    private void VerifyCode(ActionEvent event) {
        LocalUser.sendServer(VerificationCode.getText());
        
        Boolean rep = ( Boolean ) LocalUser.read();
        if(rep)
        {
            ErrorMessage.setText(" successfull ");
            try {
                    Parent root = FXMLLoader.load(getClass().getResource("/OnlineJudge/User/LogInFXML.fxml"));

                    Scene scene = new Scene(root);

                    OnlineJudge.PrimaryStage.setScene(scene);
                } catch (Exception e) {
                    System.out.println("error khaise");
                    System.out.println(e.getMessage());
                    e.printStackTrace();

                }
        }
        else 
            
        {
            ErrorMessage.setText("try again :D");
        }
        
    }

    public void setMailaddress(String mailaddress) {
        this.mailaddress = mailaddress;
        MailAddress.setText("Enter your Verification code sent to mail : " +mailaddress);
    }
    
}
