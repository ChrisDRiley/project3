/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author Christian
 */
public class registeredUser extends guestUser{
    private String username;
    private String password;
    
    public registeredUser(String name, String pass){
        canLike = true;
        canComment = true;
        username = name;
        password = pass;
    }
}
