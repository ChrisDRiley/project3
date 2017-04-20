
package backend;

/**
 * Loads the User and Post info and feeds them into the database
 * @author Christian
 */
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class fileLoader {
    Scanner input;
    public fileLoader(userDatabase uData, PostDatabase pData) throws FileNotFoundException{
        input = new Scanner(new File("C:/Users/Christian/Documents/NetBeansProjects/project3/programData/users.txt"));
        while (input.hasNext()){
            input.next();
            String a = input.next();
            input.next();
            String b = input.next();
            input.next();
            String c = input.next();
            registeredUser user = new registeredUser(a,b,c);
            uData.addUser(user);
        }
    }
}

// I think the .next() method will keep reading unless theres a delimiter, might want to do nextLine().
