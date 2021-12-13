/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.PRC_PED;

import System.Baby.*;
import System.BabyNurse.BabyNurse;
import System.GODNurse.GODNurse;
import System.GODoc.GODoc;
import System.PEDoc.PEDoc;
import System.Pregnant.Pregnant;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author harold
 */
public class PRC_PED {
    private ArrayList<BabyNurse> BabyNurseList;

    public PRC_PED() {
        //this.GODocList
        BabyNurseList = new ArrayList<>();
    }

    public ArrayList<BabyNurse> getBabyNurseList() {
        return BabyNurseList;
    }

    public void setBabyNurseList(ArrayList<BabyNurse> BabyNurseList) {
        this.BabyNurseList = BabyNurseList;
    }

    public BabyNurse searchPEDoc(String name){
        for(BabyNurse ped:BabyNurseList){
            if(ped.getName().equals(name)){
                return ped;
            }
        }
        return null;
    }
    public void addPED(BabyNurse go){
        BabyNurseList.add(go);
    }

}
