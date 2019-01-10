/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineJudge.ProblemSet;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author MAHDI
 */
public class Problem implements Serializable{
    public String Id;
    public File Statement;// pdf type statement 
    public String Type;// "static" ,"dynamic","interactive"
    public File VerifierCode;// if dynamic then verifier cpp 
    public ArrayList< File > Inputs;
    public ArrayList< File > Outputs;
    public int TotalAccepted;
    public int TotalAttempted;
    public String Name;
    public Integer TimeLimit;/// always millisec
    public Integer MemoryLimit;
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
        return "Problem{" + "Id=" + Id + ", Statement=" + Statement + ", Type=" + Type + ", VerifierCode=" + VerifierCode + ", Inputs=" + Inputs + ", Outputs=" + Outputs + ", TotalAccepted=" + TotalAccepted + ", TotalAttempted=" + TotalAttempted + ", Name=" + Name + ", TimeLimit=" + TimeLimit + ", MemoryLimit=" + MemoryLimit + '}';
    }



    
    
    
}
