/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Baby;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class BabyDirectory {
    ArrayList<Baby> babyArrayList;

    public BabyDirectory() {
        babyArrayList =new ArrayList<>();
    }
    public ArrayList<Baby> getDeliveryManArrayList() {
        return babyArrayList;
    }
    public Baby createDeliverMan(String name){
        Baby Baby =new Baby();
        Baby.setName(name);
        babyArrayList.add(Baby);
        return Baby;
    }
}
