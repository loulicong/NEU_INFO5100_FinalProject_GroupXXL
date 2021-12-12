/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Pregnant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class PregnantDirectory {
    ArrayList<Pregnant> pregnantArrayList;

    public PregnantDirectory() {
        this.pregnantArrayList = new ArrayList<>();
    }

    public ArrayList<Pregnant> getCustomerArrayList() {
        return pregnantArrayList;
    }

    public void setCustomerArrayList(ArrayList<Pregnant> pregnantArrayList) {
        this.pregnantArrayList = pregnantArrayList;
    }
    public Pregnant searchPregnant(String username){
        if(pregnantArrayList==null){
            return null;
        }
        for(Pregnant p:pregnantArrayList){
            if(p.getUsername().equals(username)){
                return p;
            }
        }
        return null;
    }
    public Pregnant createCustomer(String username, String name){
        Pregnant pregnant =new Pregnant();
        pregnant.setName(name);
        pregnantArrayList.add(pregnant);
        pregnant.setUsername(username);
        return pregnant;
    }
}
