/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.BabyNurse;

import System.PEDoc.PEDoc;
import System.PRC.PRC;
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
    public BabyNurse createDeliverMan(String name,String usrname,String sex,PRC prc){
        BabyNurse BabyNurse =new BabyNurse();
        BabyNurse.setName(name);
        BabyNurse.setSex(sex);
        BabyNurse.setPRC(prc);
        BabyNurse.setUsrname(usrname);
        BabyNurse.setStatu("Free");

        BabyNurseArrayList.add(BabyNurse);
        return BabyNurse;
    }

    public void remove(String usrname){
        for(BabyNurse go:BabyNurseArrayList){
            if(go.getUsrname().equals(usrname)){
                BabyNurseArrayList.remove(go);
            }
        }
    }

    public BabyNurse search(String usrname){
        for(BabyNurse go:BabyNurseArrayList){
            if(go.getUsrname().equals(usrname)){
                return go;
            }
        }
        return null;
    }
}
