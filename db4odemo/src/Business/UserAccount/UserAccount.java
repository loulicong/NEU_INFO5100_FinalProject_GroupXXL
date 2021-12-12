/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Role.Role;
import Business.InRequest.InRequestList;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Role role;
    private InRequestList inRequestList;

    public UserAccount() {
        inRequestList = new InRequestList();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }


    public void setRole(Role role) {
        this.role = role;
    }

    public InRequestList getWorkQueue() {
        return inRequestList;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}