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
    PrintWriter writer = null;
    public fileWriter(userDatabase uData) throws FileNotFoundException{
        writer = new PrintWriter("C:/Users/Christian/Documents/NetBeansProjects/project3/programData/users.txt");
        for(int i = 0; i < uData.size(); i++){
            writer.println(uData.getUser(i).toString());
        }
    }
}

