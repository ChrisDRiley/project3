/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import UserGUI.*;
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
    public static userDatabase uData;
    public static PostDatabase pData;
    
    public fileWriter() throws FileNotFoundException{
        uData = UserLogin.uData;
        pData = UserLogin.pData;
        
        
    }
    public void writeUser() throws FileNotFoundException{
        
        uwriter = new PrintWriter(
                new FileOutputStream("C:/Users/Christian/Documents/NetBeansProjects/project3/programData/users.txt",false));
        for(int i = 0; i < uData.size(); i++){
            uwriter.println(uData.getUser(i).toString());
            uwriter.println(uData.getUser(i).getDescription());
        }
        uwriter.flush();
        uwriter.close();
    }
    public void writePost() throws FileNotFoundException{
        ArrayList<String> hashes = null;
        ArrayList<String> comments = null;
        
        pwriter = new PrintWriter(
                new FileOutputStream("C:/Users/Christian/Documents/NetBeansProjects/project3/programData/posts.txt",false));
        for(int l = 0; l < pData.size(); l++){
            pwriter.println(pData.getPost(l).toString());
            System.out.println("Added User");
            hashes = pData.getPost(l).getHashtags();
            for(int j = 0; j < hashes.size(); j++){
                pwriter.print(hashes.get(j)+" ");
                System.out.println("Added hashtag");
            }
            pwriter.println();
            comments = pData.getPost(l).getComments();
            for(int k = 0; k < comments.size(); k++){
                pwriter.print(comments.get(k)+ " ");
                System.out.println("Added comment");
            }
            pwriter.println();
        }
        pwriter.flush();
        pwriter.close();
    }
            
}

