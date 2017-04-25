
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
    
    public Post(String pic, registeredUser user, ArrayList<String> hash, int numLikes){
       
        picture = new File(pic);
        ownedBy = user;
        comments = new ArrayList<String>();
        hashtags = new ArrayList<String>();
    
        for(String hashes : hash){
            hashtags.add(hashes);
        }
        timePosted = LocalDateTime.now();
        likes = numLikes;
    }
    public void addLike(){
        likes++;
    }
    public void addComment(String comment){
        comments.add(comment);
    }
    public File getPic(){
        return picture; 
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
    public LocalDateTime getTime()
    {
        return timePosted;
    }
    public String toString(){
        return picture.getAbsolutePath()+ " "+ownedBy.getUsername()+" "+likes;
    }
}
