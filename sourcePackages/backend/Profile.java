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

/**
 *
 * @author Daniel Mulyono
 */
public class Profile 
{
    private ArrayList<String> pictures = new ArrayList<>();
    private boolean followed;
    private String userName;
    private String profilePicture;
    
    /**
     * Default constructor for the Profile object
     * @param lastName The last name of the profile.
     * @param firstName The first name of the profile.
     * @throws FileNotFoundException If files are not found.
     */
    public Profile(String lastName, String firstName) throws FileNotFoundException
    {
        String pictureFile = lastName + firstName + "userPictures.txt";
        String profileConfig = lastName + firstName + "profileConfig.txt";
        String filePath = new File("").getAbsolutePath(); //Getting file path.
        File pictureLibrary = new File(filePath + pictureFile); //Need to check if I need to add "/" between the concat.
        File profileSetting = new File(filePath + profileConfig); //Need to check if I need to add "/" between the concat.
        
        //Loading pictures belonging to profile into an arrayList to be used by another class.
        Scanner fileRead = new Scanner(pictureLibrary);
        while (fileRead.hasNextLine())
        {
            pictures.add(filePath + fileRead.nextLine());
        }
        
        //Loading username and profile pictures into data members to be used by another class.
        fileRead = new Scanner(profileSetting);
        while (fileRead.hasNextLine())
        {
            String line = fileRead.nextLine();
            String[] content = line.split("\\s+");
            if (content[0].equalsIgnoreCase("userName:"))
            {
                userName = content[1];
            }
            else if (content[0].equalsIgnoreCase("profilePicture:"))
            {
                profilePicture = content[1];
            }
        }
    }
    public Profile(String name, File profilePic){
        userName = name;
        profilePicture = profilePic.getName();
    }
    
    /**
     * Getter method for username.
     * @return The profile's username.
     */
    public String getUserName()
    {
        return userName;
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
    public ArrayList getPictures()
    {
        return pictures;
    }
}
