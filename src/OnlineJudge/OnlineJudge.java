/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineJudge;

import OnlineJudge.ProblemSet.ProblemSet;
import OnlineJudge.Submission.Submission;
import OnlineJudge.Submission.SubmissionSet;
import OnlineJudge.User.User;
import java.util.ArrayList;
import java.util.HashMap;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
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
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/OnlineJudge/OnlineJudgeFXML.fxml"));
        
        Scene scene = new Scene(root,720,600);
        
        stage.setScene(scene);
        stage.show();
        PrimaryStage=stage;
        PrimaryRoot=root;
        stage.setAlwaysOnTop(true);
        stage.setOnCloseRequest((event) -> {
            SubmissionSet.SaveSubmissionSet();
            ProblemSet.SaveProblemSet();
            
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProblemSet.LoadProblemSet();
        SubmissionSet.LoadSubmissionSet();
        launch(args);
        
    }
    
}
