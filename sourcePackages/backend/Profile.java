/*
Don't know how you guys want to implement the followed data member,
let me know and I will edit the class. We still need to figure out data structure,
This will help using a relative path to point to each file. Let me know how you guys want
to name each text file.
*/
package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import UserGUI.*;

/**
 *
 * @author Daniel Mulyono
 */
public class Profile 
{
    private ArrayList<Post> pictures = new ArrayList<Post>();
    private boolean followed;
    private String userName;
    private String profilePicture;
    private String description;
    private boolean exist;
    public static userDatabase uData;
    public static PostDatabase pData;
    
    /**
     * Default constructor for the Profile object
     * @param userName The user name of the profile.
     */
    public Profile(String userName) 
    {
        uData = UserLogin.uData;
        pData = UserLogin.pData;
        exist = true;
        
        for(int i = 0; i < pData.size(); i++)
        {
            if(pData.getPost(i).getUser().getUsername().equalsIgnoreCase(userName)){
                pictures.add(pData.getPost(i));
            }
        }
        
        //Loading username and profile pictures into data members to be used by another class.
        for(int i = 0; i < uData.size(); i++){
            if(uData.getUser(i).getUsername().equalsIgnoreCase(userName)){
                this.userName = uData.getUser(i).getUsername();
                profilePicture = uData.getUser(i).getPic().getAbsolutePath();
                description = uData.getUser(i).getDescription();
            }
        }
   
    }
    
    public Profile(String name, File profilePic){
        userName = name;
        profilePicture = profilePic.getName();
    }
    
    /**
     * Constructor to be used when a user with a given name does not exist.
     */
    public Profile()
    {
        exist = false;
    }
    
    /**
     * Getter method to check if a user exist.
     * @return True if the user exists, false if the user does not exist.
     */
    public boolean userExist()
    {
        return exist;
    }
    
    /**
     * Getter method for username.
     * @return The profile's username.
     */
    public String getUserName()
    {
        return userName;
    }
    public void setDescription(String replace){
        description = replace;
    }
    public String getDescription(){
        return description;
    }
    
    /**
     * Getter method for profilePicture.
     * @return The default profile picture.
     */
    public String getProfilePicture()
    {
        return profilePicture;
    }
    
    /**
     * Getter method for a list of pictures associated with the profile.
     * @return An arrayList of image files.
     */
    public ArrayList getPosts()
    {
        return pictures;
    }
}
