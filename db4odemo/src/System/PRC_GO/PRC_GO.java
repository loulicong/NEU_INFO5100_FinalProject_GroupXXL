/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.PRC_GO;

import System.Baby.*;
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
public class PRC_GO {
    private ArrayList<GODNurse> GODNurseList;

    public PRC_GO() {
        //this.GODocList
        GODNurseList = new ArrayList<>();
    }

    public ArrayList<GODNurse> getGODNurseList() {
        return GODNurseList;
    }

    public void setGODNurseList(ArrayList<GODNurse> GODNurseList) {
        this.GODNurseList = GODNurseList;
    }

    public GODNurse searchGODoc(String name){
        if (GODNurseList==null){
            return null;
        }
        for(GODNurse go:GODNurseList){
            if(go.getName().equals(name)){
                return go;
            }
        }
        return null;
    }

    public void addGOD(GODNurse go){
        GODNurseList.add(go);
    }


}
