/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineJudge;

import java.net.*;
import java.io.*;
/**
 *
 * @author MAHDI
 */
public class Network {
    public static void sendObject(Socket s,Object obj) throws IOException
    {
        ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
        oos.writeObject(obj);
        oos.flush();
    }
}
