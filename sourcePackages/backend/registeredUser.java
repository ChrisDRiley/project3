/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author Christian
 */
public class registeredUser extends guestUser{
    private String username;
    private String password;
    private ArrayList<String> followers;
    private File profilePic;
    private String description;
    
    public registeredUser(String name, String pass, String profPic,ArrayList<String> follow) throws FileNotFoundException{
        canLike = true;
        canComment = true;
        username = name;
        password = pass;
        followers = new ArrayList<String>();
        for(int i = 0; i < follow.size(); i++){
            followers.add(follow.get(i));        }
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
    public String getDescription(){
        return description;
    }
    public ArrayList<String> getFollowers(){
        return followers;
    }
    public void setDescription(String replace){
        description = replace;
    }
    public String toString(){
        return "userName: "+username+" password: "+password+" profilePicture: "+profilePic.getPath();
    }
    public boolean equals(registeredUser user2){
        return username.equals(user2.getUsername());
    }
}
