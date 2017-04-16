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
    //Will change.
    public Profile searchUser(String userName) throws FileNotFoundException
    {
        userDatabase users = new userDatabase();
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
            Profile account = new Profile(users.getUser(position).getUsername());
            return account;
        }
        else
        {
            Profile account = new Profile();
            return account;
        }
    }
    
    public ArrayList searchTag(String hashtag)
    {
        PostDatabase posts = new PostDatabase();
        ArrayList<Post> postings = new ArrayList<>();
        boolean exist = false;
        
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
    }
}
