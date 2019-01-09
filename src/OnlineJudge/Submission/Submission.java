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
    public String Handle;
    public String Language;
    public String Code;
    public String Verdict;
    public String Time;
    public String TimeTaken;
    public String MemoryTaken;
    public String Id;
    public String ProblemName;
    public Submission(String ProbmemId, String Handle, String Lang, String Code) {
        this.ProbmemId = ProbmemId;
        this.ProblemName="in submission";
        this.Handle = Handle;
        this.Language = Lang;
        this.Code = Code;
        Time=LocalDateTime.now().toString();
        Verdict= "Not Judged Yet";
        TimeTaken="";
        MemoryTaken="";
    }

    public String getProbmemId() {
        return ProbmemId;
    }

    public String getHandle() {
        return Handle;
    }

    public String getLanguage() {
        return Language;
    }

    public String getCode() {
        return Code;
    }

    public String getVerdict() {
        return Verdict;
    }

    public String getTime() {
        return Time;
    }

    public String getTimeTaken() {
        return TimeTaken;
    }

    public String getMemoryTaken() {
        return MemoryTaken;
    }

    public String getId() {
        return Id;
    }

    public String getProblemName() {
        return ProblemName;
    }
    
    
}
