/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author Daniel M.
 */
public class SearchEngine 
{
    /**
     * This method will search through the user database for a matching username.
     * @param userName The name of the user to be searched.
     * @param users The database that will be used for the search.
     * @return It will return a registeredUser object to be manipulated by another class,
     * if it does not exist then it will return null
     * @throws FileNotFoundException 
     */
    public registeredUser searchUser(String userName, userDatabase users)
    {
        boolean exist = false;
        int position = 0;
        
        for (int i = 0; i < users.size(); i++)
        {
            if (users.getUser(i).getUsername().equalsIgnoreCase(userName))
            {
                exist = true;
                position = i;
            }
        }
        if (exist)
        {
            return users.getUser(position);
        }
        else
        {
            return null;
        }
    }
    
    /**
     * This method will search through the post database for any posts with a matching hashtag.
     * @param hashtag The hashtag to be searched.
     * @param posts The database to be used for the search.
     * @return It will return an ArrayList of posts with matching hashtags to be manipulated by another class.
     */
    public ArrayList searchTag(String hashtag, PostDatabase posts)
    {
        ArrayList<Post> postings = new ArrayList<>();
        
        for (int i = 0; i < posts.size(); i++)
        {
            ArrayList<String> tags = posts.getPost(i).getHashtags();
            for (int j = 0; j < tags.size(); j++)
            {
                if (hashtag.equalsIgnoreCase(tags.get(j)))
                {
                    postings.add(posts.getPost(i));
                }
            }
        }
        return postings; //Must do some testings to see what it will return if no matches are found, might need to be handled by the invoking class.
    }
}
