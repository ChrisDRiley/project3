
package backend;

/**
 * Loads the User and Post info and feeds them into the database
 * @author Christian
 */
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class fileLoader {
    Scanner input;
    userDatabase uData;
    PostDatabase pData;
    
    public fileLoader() throws FileNotFoundException{
        input = new Scanner(new File("C:/Users/Christian/Documents/NetBeansProjects/project3/programData/users.txt"));
        while (input.hasNext()){
            input.next();
            String a = input.next();
            input.next();
            String b = input.next();
            input.next();
            String c = input.next();
            registeredUser user = new registeredUser(a,b,c);
            this.uData.addUser(user);
        }
        
        input = new Scanner(new File("C:/Users/Christian/Documents/NetBeansProjects/project3/programData/posts.txt"));
        while (input.hasNextLine())
        {
            String line = input.nextLine();
            String[] header = line.split("\\s+");
            String picture = header[0];
            String name = header[1];
            int position = -1;
            for (int i = 0; i < uData.size(); i++)
            {
                if (name.equalsIgnoreCase(uData.getUser(i).getUsername()))
                {
                    position = i;
                }
            }
            line = input.nextLine();
            String comment = line.substring(0, line.indexOf("#"));
            String[] hashtags = line.substring(line.indexOf("#")).split("#");
            ArrayList<String> finalHashtag = new ArrayList<>();
            for (String i : hashtags)
            {
                finalHashtag.add("#" + i);
            }
            Post posting = new Post(picture, uData.getUser(position), finalHashtag);
            posting.addComment(comment);
            pData.addPost(posting);
        }
    }
    
    public userDatabase getUserDatabase()
    {
        return uData;
    }
    
    public PostDatabase getPostDatabase()
    {
        return pData;
    }
}
