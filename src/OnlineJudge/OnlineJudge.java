/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineJudge;

import OnlineJudge.Submission.Submission;
import OnlineJudge.User.User;
import java.util.ArrayList;
import java.util.HashMap;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Pair;

/**
 *
 * @author MAHDI
 */
public class OnlineJudge  extends Application  {
    public static Stage PrimaryStage;
    public static Parent PrimaryRoot;
    public static AnchorPane Nodes ;
    public static HashMap < String , User > getUser = new HashMap< String, User>() ;
    public static ArrayList < Submission > Submissions;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/OnlineJudge/OnlineJudgeFXML.fxml"));
        
        Scene scene = new Scene(root,720,600);
        
        stage.setScene(scene);
        stage.show();
        PrimaryStage=stage;
        PrimaryRoot=root;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Submissions = new ArrayList< Submission > ();
        launch(args);
        
    }
    
}
