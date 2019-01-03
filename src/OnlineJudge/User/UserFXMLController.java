/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineJudge.User;

import OnlineJudge.OnlineJudge;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author MAHDI
 */
public class UserFXMLController implements Initializable {

    @FXML
    private Text UserName;
    @FXML
    private AnchorPane Node;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        OnlineJudge.Nodes=Node;
        // TODO
    }    

    @FXML
    private void HomeButtonClicked(ActionEvent event) throws IOException {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/OnlineJudge/OnlineJudgeFXML.fxml"));
            Node.getChildren().add(root);
            //Scene scene = new Scene(root,720,600);
        
            //OnlineJudge.PrimaryStage.setScene(scene);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.exit(-1);
        }
        
            
        
        
        
    }

    @FXML
    private void ContestButtonClicked(ActionEvent event) {
    }

    @FXML
    private void ProblemsetButtonClicked(ActionEvent event) {
    }

    @FXML
    private void SubmitSolutionButtonClicked(ActionEvent event) {
    }

    @FXML
    private void StatusButtonClicked(ActionEvent event) {
    }

    @FXML
    private void MySubmissionButtonClicked(ActionEvent event) {
    }

    @FXML
    private void MyProfileButtonClicked(ActionEvent event) {
    }

    @FXML
    private void LogOutButtonClicked(ActionEvent event) {
        
    }
    
}
