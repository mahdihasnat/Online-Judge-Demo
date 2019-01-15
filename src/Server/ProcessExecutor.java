/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import OnlineJudge.ProblemSet.ProblemSet;
import OnlineJudge.Submission.Submission;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import OnlineJudge.ProblemSet.*;

/**
 *
 * @author Student06
 */




class StreamGobbler implements Runnable {
    InputStream is;
    String type;
    OutputStream os;
    Thread t;
    String str;
    String error;

    StreamGobbler(InputStream is, String type) {
    	this.is = is;
        this.type = type;
        this.os = null;
    	t=new Thread(this);
    } 

    StreamGobbler(InputStream is, String type, OutputStream redirect) {
        this.is = is;
        this.type = type;
        this.os = redirect;
        t = new Thread(this);
    }
    
    StreamGobbler(OutputStream os,String type, InputStream redirect) {
        this.os = os;
        this.type = type;
        this.is = redirect;
        t = new Thread(this);
    }
    
    public void start() {
    	t.start();
    }


    public void run() {
        try {
            PrintWriter pw = null;
            if (os != null) pw = new PrintWriter(os);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ( (line = br.readLine()) != null)
            {
                if (pw != null) pw.println(line);
                System.out.println(type + ">" + line);
            }
            if (pw != null) pw.flush();
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
}








public class ProcessExecutor {

    int ExitValue;

    public ProcessExecutor(Submission submission) {
        try {
            System.out.println("Exexuting ");
            if (submission.Language.equalsIgnoreCase("C++")) {
                WriteFile(submission.Code, "cppcode.cpp");
                final String CppCommand="g++ cppcode.cpp";
                Problem problem = ProblemSet.Problems.get(submission.ProbmemId);
                submission.Verdict="Judging ... ... ...";
                for(int i=0;i<problem.Inputs.size();i++)
                {
                    //Runtime rt=Runtime.getRuntime()
                    
                    //string verdic=ExecuteOne()
                }
                
                
                
            }
        } catch (Exception ex) {
            System.out.println(ex.getCause());
            Logger.getLogger(ProcessExecutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void WriteFile(String Code, String FileName) throws FileNotFoundException {
        System.out.println("In write file");
        System.out.println(Code);
        System.out.println(FileName);
        PrintWriter out = new PrintWriter(FileName);
        out.println(Code);
        out.close();
    }
    static private String ReadFile(File f) 
    {
        String src="";
        try {
            FileInputStream fis=new FileInputStream(f);
            BufferedInputStream bir= new BufferedInputStream(fis);
            int c=1;
            while((c=bir.read())!=-1)
            {
                
                System.out.print((char)c);
                src+=Character.toString((char)c);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        return src;
    }
    static String ExecuteOneCpp(File SourceCode,File Input,File Output,File ReirectOutput,String Error) throws FileNotFoundException, IOException
    {
        
            ProcessBuilder cmd = new ProcessBuilder("cmd"); 
  
            // take all commands as input in a text file 
            File CmdCpp = new File("CmdCpp.txt"); 
            if(!CmdCpp.exists()) CmdCpp.createNewFile();
            System.out.println("Compiling "+SourceCode.getName());
            WriteFile("g++ "+SourceCode.getName(),CmdCpp.getName());
            
            File CmdError = new File("CmdError.txt"); 
            File CmdOutput = new File("CmdOutput.txt"); 
 
            // redirect all the files 
            cmd.redirectInput(CmdCpp); 
            cmd.redirectOutput(CmdOutput); 
            cmd.redirectError(CmdError);
            File exe = new File("a.exe");
            if(exe.exists()) exe.delete();
            // start the process 
            Process pc= cmd.start();
            
            if(!exe.exists())
            {
                Error=ReadFile(CmdError);
                return "Compilation Error";
            }
                    
            ProcessBuilder pb= new ProcessBuilder("a.exe");
            
            pb.redirectInput(Input); 
            pb.redirectOutput(ReirectOutput); 
            pb.redirectError(CmdError);
            
            
            Process pce = pb.start();
            
            System.out.println("Exit execxute ones");
            return "Accepted";
    }

}
