/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineJudge.User;

import OnlineJudge.ProblemSet.ProblemShowFXMLController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author MAHDI
 */
public class SubmitFXMLController implements Initializable {

    private final String CppCode="#include <iostream>\n" +
"\n" +
"using namespace std;\n" +
"\n" +
"int main() {\n" +
"	\n" +
"	return 0;\n" +
"}";
    private final String JavaCode = "public class Solution {\n" +
"	public static void main(String[] args) {\n" +
"		\n" +
"	}\n" +
"}";
    @FXML
    private TextField ProblemName;
    @FXML
    private MenuButton SelectLanguageButton;
    @FXML
    private Button ChoseFileButton;
    @FXML
    private Label FileMessege;
    @FXML
    private TextArea SourceCode;
    @FXML
    private Label ErrorMessage;
    @FXML
    private Label ProblemIdMessage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        if(ProblemShowFXMLController.problem==null)
        {
            ProblemIdMessage.setVisible(true);
            ProblemName.setEditable(true);
        }
        else
        {
            ProblemIdMessage.setVisible(false);
            ProblemName.setEditable(false);
            ProblemName.setText(ProblemShowFXMLController.problem.getId()+" - "+ProblemShowFXMLController.problem.getName());
        }
        ErrorMessage.setText("");
    }    

    @FXML
    private void CppChosed(ActionEvent event) {
        SelectLanguageButton.setText("C++");
        SourceCode.setText(CppCode);
        
    }

    @FXML
    private void JavaChoosed(ActionEvent event) {
        SelectLanguageButton.setText("Java");
         SourceCode.setText(JavaCode);
    }

    @FXML
    private void SubmitButtonClicked(ActionEvent event) {
    }
    
}
