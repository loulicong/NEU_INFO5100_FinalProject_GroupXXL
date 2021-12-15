/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.BabyNurse;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class BabyNurseDirectory {
    ArrayList<BabyNurse> BabyNurseArrayList;

    public BabyNurseDirectory() {
        BabyNurseArrayList =new ArrayList<>();
    }
    public ArrayList<BabyNurse> getDeliveryManArrayList() {
        return BabyNurseArrayList;
    }
    public BabyNurse createDeliverMan(String name){
        BabyNurse BabyNurse =new BabyNurse();
        BabyNurse.setName(name);
        BabyNurseArrayList.add(BabyNurse);
        return BabyNurse;
    }
}
