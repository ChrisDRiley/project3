/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author Daniel M.
 */
public class Login 
{
    String userName;
    boolean exist;
    boolean passwordMatch;
    
    public Login(String userName, String password, userDatabase uData)
    {
        this.userName = userName;
        
        for (int i = 0; i < uData.size(); i++)
        {
            if (uData.getUser(i).getUsername().equalsIgnoreCase(userName))
            {
                exist = true;
                if (uData.getUser(i).getPass().matches(password))
                {
                    passwordMatch = true;
                }
            }
        }
    }
    
    public String getUser()
    {
        return userName;
    }
    
    public boolean getUserExist()
    {
        return exist;
    }
    
    public boolean getMatchingPassword()
    {
        return passwordMatch;
    }
}
