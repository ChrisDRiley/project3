
package backend;

import java.util.ArrayList;

public class PostDatabase {
    private ArrayList<Post> posts;
    
    public PostDatabase(){
        posts = new ArrayList<Post>();
    }
    public void addPost(Post post){
        posts.add(post);
    }
    public Post getPost(int index){
        return posts.get(index);
    }
}
