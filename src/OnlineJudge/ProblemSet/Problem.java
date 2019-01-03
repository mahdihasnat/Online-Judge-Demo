/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineJudge.ProblemSet;

import java.io.File;

/**
 *
 * @author MAHDI
 */
public class Problem {
    public File Statement;// pdf type statement 
    public String Type;// "static" ,"dynamic","interactive"
    public File VerifierCpp;// if dynamic then verifier cpp file
    public File VerifierJava;// if dynamic then verifier java file
    public File[] Inputs;
    public File[] Outputs;
    public int TotalAccepted;
    public int TotalAttempted;
    public int ProblemNumber;
    public String ProblemName;
    public String[] Tags;
    public Integer TimeLimit; /// always millisec
}
