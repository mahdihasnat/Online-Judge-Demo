/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineJudge.ProblemSet;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author MAHDI
 */
public class Problem implements Serializable{
    public String Id;
    public File Statement;// pdf type statement 
    public String Type;// "static" ,"dynamic","interactive"
    public File VerifierCpp;// if dynamic then verifier cpp file
    public File VerifierJava;// if dynamic then verifier java file
    public File[] Inputs;
    public File[] Outputs;
    public int TotalAccepted;
    public int TotalAttempted;
    public String Name;
    public String[] Tags;
    public Integer TimeLimit; /// always millisec
    public Problem(String Id,String Name )
    {
        this.Id=Id;
        this.Name=Name;
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Problem{" + "Id=" + Id + ", Statement=" + Statement + ", Type=" + Type + ", VerifierCpp=" + VerifierCpp + ", VerifierJava=" + VerifierJava + ", Inputs=" + Inputs + ", Outputs=" + Outputs + ", TotalAccepted=" + TotalAccepted + ", TotalAttempted=" + TotalAttempted + ", Name=" + Name + ", Tags=" + Tags + ", TimeLimit=" + TimeLimit + '}';
    }
    
    
}
