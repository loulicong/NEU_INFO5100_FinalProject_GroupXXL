/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.GODNurse;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class GODNurseDirectory {
    ArrayList<GODNurse> GODNurseArrayList;

    public GODNurseDirectory() {
        GODNurseArrayList =new ArrayList<>();
    }
    public ArrayList<GODNurse> getDeliveryManArrayList() {
        return GODNurseArrayList;
    }
    public GODNurse createDeliverMan(String name){
        GODNurse GODNurse =new GODNurse();
        GODNurse.setName(name);
        GODNurseArrayList.add(GODNurse);
        return GODNurse;
    }
}
