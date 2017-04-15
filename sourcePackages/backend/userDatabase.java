/*
Need to be updated so that when the object is created, it loads a list of existing users into an ArrayList.
*/

package backend;
import java.util.ArrayList;

public class userDatabase {
    private ArrayList<registeredUser> users;
    
    public userDatabase(){
        users = new ArrayList<registeredUser>();
    }
    
    public void addUser(registeredUser user){
        users.add(user);
    }
    public registeredUser getUser(int index){
        return users.get(index);
    }
    public int size(){
        return users.size();
    }
}
