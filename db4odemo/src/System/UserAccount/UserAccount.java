/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.UserAccount;

import System.Role.Role;
import System.InRequest.InRequestList;

/**
 *
 * @author raunak
 */
public class UserAccount {

    private String username;
    private String password;
    private Role role;
    private InRequestList HospitalinRequestList;
    private InRequestList PRCinRequestList;

    public UserAccount() {
        HospitalinRequestList = new InRequestList();
        PRCinRequestList = new InRequestList();
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

    public InRequestList getHospitalinRequestListt() {
        return HospitalinRequestList;
    }

    public InRequestList getPRCinRequestList() {
        return PRCinRequestList;
    }




    @Override
    public String toString() {
        return username;
    }



}