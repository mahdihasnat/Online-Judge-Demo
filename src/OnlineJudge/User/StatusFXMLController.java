/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineJudge.User;

import OnlineJudge.OnlineJudge;
import OnlineJudge.ProblemSet.Problem;
import OnlineJudge.Submission.Submission;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author WNL
 */
public class StatusFXMLController implements Initializable {

    @FXML
    private TableColumn<Submission, String > SubmissionId;
    @FXML
    private TableColumn<Submission, String > SubmissionTime;
    @FXML
    private TableColumn<Submission, String > UserHandle;
    @FXML
    private TableColumn<Submission, String > ProblemName;
    @FXML
    private TableColumn<Submission, String > Language;
    @FXML
    private TableColumn<Submission, String > Verdict;
    @FXML
    private TableColumn<Submission, String > TimeTaken;
    @FXML
    private TableColumn<Submission, String > MemoryTaken;
    @FXML
    private TableView<Submission> StatusTable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Table View ini");
        
        
        SubmissionId.setCellValueFactory(new PropertyValueFactory<Submission,String>("Id"));
        System.out.println("Here cell detected");
        SubmissionTime.setCellValueFactory(new PropertyValueFactory<Submission,String>("Time"));
        System.out.println("Here cell detected");
        UserHandle.setCellValueFactory(new PropertyValueFactory<Submission,String>("Handle"));
        System.out.println("Here cell detected");
        ProblemName.setCellValueFactory(new PropertyValueFactory<Submission,String>("ProblemName"));
        System.out.println("Here cell detected");
        Language.setCellValueFactory(new PropertyValueFactory<Submission,String>("Language"));
        System.out.println("Here cell detected");
        Verdict.setCellValueFactory(new PropertyValueFactory<Submission,String>("Verdict"));
        System.out.println("Here cell detected");
        TimeTaken.setCellValueFactory(new PropertyValueFactory<Submission,String>("TimeTaken"));
        System.out.println("Here cell detected");
        MemoryTaken.setCellValueFactory(new PropertyValueFactory<Submission,String>("MemoryTaken"));
        System.out.println("Here cell detected");
        StatusTable.getItems().removeAll(StatusTable.getItems());
        StatusTable.getItems().addAll(OnlineJudge.Submissions);
        
        
    }    
    
}
