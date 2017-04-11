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
    
    public registeredUser(String name, String pass, File profPic){
        canLike = true;
        canComment = true;
        username = name;
        password = pass;
        profilePic = profPic;
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
}
