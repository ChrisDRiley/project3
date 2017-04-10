
package backend;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class Post {
    private int likes;
    private File picture;
    private ArrayList<String> comments;
    private ArrayList<String> hashtags;
    private registeredUser ownedBy;
    private LocalDateTime timePosted;
    
    public Post(File pic, registeredUser user, ArrayList<String> hash){
        String filePath = new File("").getAbsolutePath();
        picture = new File(filePath + pic);
        ownedBy = user;
        comments = new ArrayList<String>();
        hashtags = new ArrayList<String>();
        for(String hashes : hash){
            hashtags.add(hashes);
        }
        timePosted = LocalDateTime.now();
        likes = 0;
    }
    public void addLike(){
        likes++;
    }
    public void addComment(String comment){
        comments.add(comment);
    }
    public int getLikes(){
        return likes;
    }
    public ArrayList<String> getComments(){
        return comments;
    }
    public ArrayList<String> getHashtags(){
        return hashtags;
    }
    public registeredUser getUser(){
        return ownedBy;
    }
}
