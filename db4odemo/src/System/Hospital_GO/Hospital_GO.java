/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Hospital_GO;

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
public class Hospital_GO {
    private ArrayList<GODoc> GODocList;

    public Hospital_GO() {
        GODocList =new ArrayList<>();
        //this.GODocList
    }

    public ArrayList<GODoc> getGODocList() {
        return GODocList;
    }

    public void setGODocList(ArrayList<GODoc> GODocList) {
        this.GODocList = GODocList;
    }

    public GODoc searchGODoc(String name){
        if (GODocList==null){
            return null;
        }
        for(GODoc go:GODocList){
            if(go.getName().equals(name)){
                return go;
            }
        }
        return null;
    }

    public void addGOD(GODoc go){
        GODocList.add(go);
    }

}
