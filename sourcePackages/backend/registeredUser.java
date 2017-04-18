/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import java.io.*;
/**
 *
 * @author Christian
 */
public class registeredUser extends guestUser{
    private String username;
    private String password;
    private File profilePic;
    
    public registeredUser(String name, String pass, String profPic) throws FileNotFoundException{
        canLike = true;
        canComment = true;
        username = name;
        password = pass;
        try{
            profilePic = new File(profPic);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public String getUsername(){
        return username;
    }
    public String getPass(){
        return password;
    }
    public File getPic(){
        return profilePic;
    }
    public String toString(){
        return "userName: "+username+", password: "+password+", profilePicture: "+profilePic.getPath();
    }
}
