/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Baby;

import System.Pregnant.Pregnant;
import java.util.ArrayList;
import java.util.Date;

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
    public Baby createDeliverMan(String name,Date Birth, Pregnant mom){
        Baby Baby =new Baby();
        Baby.setName(name);
        Baby.setBirth(Birth);
        Baby.setMom(mom);
        babyArrayList.add(Baby);
        return Baby;
    }

    public Baby search(String name){
        if(babyArrayList==null){
            return null;
        }
        for(Baby baby:babyArrayList){
            if (baby.getName().equals(name)){
                return baby;
            }
        }
        return  null;
    }
}
