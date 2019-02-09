/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineJudge.ProblemSet;

import java.util.HashMap;

/**
 *
 * @author MAHDI
 */
public class ProblemSet  {

    public static HashMap< String, Problem> Problems = new HashMap< String, Problem>();


    public static HashMap<String, Problem> getProblems() {
        return Problems;
    }

    public static void setProblems(HashMap<String, Problem> Problems) {
        ProblemSet.Problems = Problems;
    }

}
