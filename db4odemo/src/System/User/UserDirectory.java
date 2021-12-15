/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.User;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class UserDirectory {
    ArrayList<User> userArrayList;

    public UserDirectory() {
        this.userArrayList = new ArrayList<>();
    }

    public ArrayList<User> getCustomerArrayList() {
        return userArrayList;
    }

    public void setCustomerArrayList(ArrayList<User> userArrayList) {
        this.userArrayList = userArrayList;
    }

    public User createCustomer(String username,String name){
        User user =new User();
        user.setName(name);
        userArrayList.add(user);
        user.setUsername(username);
        return user;
    }
}
