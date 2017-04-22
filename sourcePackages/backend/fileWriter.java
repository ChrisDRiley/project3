/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import java.io.*;
import java.nio.*;
import java.util.*;

/**
 *
 * @author Christian
 */
public class fileWriter{
    PrintWriter uwriter = null;
    PrintWriter pwriter = null;
    
    public fileWriter(userDatabase uData, PostDatabase pData) throws FileNotFoundException{
        uwriter = new PrintWriter(
                new FileOutputStream("C:/Users/Christian/Documents/NetBeansProjects/project3/programData/users.txt",false));
        for(int i = 0; i < uData.size(); i++){
            uwriter.println(uData.getUser(i).toString());
        }
        uwriter.flush();
        uwriter.close();
        
        pwriter = new PrintWriter(new FileOutputStream("C:/Users/Christian/Documents/NetBeansProjects/project3/programData/posts.txt",false));
        for(int i = 0; i < pData.size(); i++){
            pwriter.println(pData.getPost(i).toString());
        }
        pwriter.flush();
        pwriter.close();
    }
}

