/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Hospital_PED;

import System.Baby.*;
import System.GODoc.GODoc;
import System.PEDoc.PEDoc;
import System.Pregnant.Pregnant;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author harold
 */
public class Hospital_PED {
    private ArrayList<PEDoc> PEDocList;

    public Hospital_PED() {
        PEDocList = new ArrayList<>();
        //this.GODocList
    }

    public ArrayList<PEDoc> getPEDocList() {
        return PEDocList;
    }

    public void setPEDocList(ArrayList<PEDoc> PEDocList) {
        this.PEDocList = PEDocList;
    }

    public PEDoc searchPEDoc(String name){
        if (PEDocList==null){
            return null;
        }
        for(PEDoc ped:PEDocList){
            if(ped.getName().equals(name)){
                return ped;
            }
        }
        return null;
    }
    public void addPED(PEDoc go){
        PEDocList.add(go);
    }
}
