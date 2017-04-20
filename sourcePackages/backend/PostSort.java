/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 * This class will be used to sort posts starting with the most recent.
 * @author Daniel M.
 */
public class PostSort 
{
    public int compare(Post post1, Post post2)
    {
        return (post1.getTime().compareTo(post2.getTime()));
    }
}
