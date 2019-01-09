/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineJudge.ProblemSet;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author MAHDI
 */
public class ProblemSetFXMLController implements Initializable {

    @FXML
    private TableView<Problem> ProblemsTable;
    @FXML
    private TableColumn<Problem, String> ProblemId;
    @FXML
    private TableColumn<Problem, String> ProblemName;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Table View ini");
        //ProblemsTable.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
         ObservableList<Problem> data = FXCollections.observableArrayList(
    new Problem("Jacob", "Smith"),
    new Problem("Isabella", "Johnson" ),
    new Problem("Ethan", "Williams" ),
    new Problem("Emma", "Jones" ),
    new Problem("Michael", "Brown" )
        );
        
        ProblemId.setCellValueFactory(new PropertyValueFactory<Problem,String>("Id"));
        ProblemName.setCellValueFactory(new PropertyValueFactory<Problem,String>("Name"));
        ProblemsTable.setItems(data);
        
    }    

    @FXML
    private void ShowProblem(KeyEvent event) {
        System.out.println("ShowProblem in keyboard ");
        //Problem SelectedProblem= ProblemsTable.getSelectionModel().getSelectedItem();
        //System.out.println("Selected problm "+SelectedProblem);
    }

    @FXML
    private void ShowProblem(MouseEvent event) {
        System.out.println("ShowProblem in mouse ");
    }
    
}