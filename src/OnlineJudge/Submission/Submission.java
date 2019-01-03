/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineJudge.Submission;

import java.time.LocalDateTime;

/**
 *
 * @author MAHDI
 */
public class Submission {
    public String ProbmemId;
    public String UserHandle;
    public String Lang;
    public String Code;
    public String Verdict;
    public String Time;
    public Submission(String ProbmemId, String UserHandle, String Lang, String Code) {
        this.ProbmemId = ProbmemId;
        this.UserHandle = UserHandle;
        this.Lang = Lang;
        this.Code = Code;
        Time=LocalDateTime.now().toString();
        Verdict= "";
        
    }
    
    
}
