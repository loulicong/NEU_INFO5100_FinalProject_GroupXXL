/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.GODoc;

import System.Hospital.Hospital;
import System.PEDoc.PEDoc;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class GODocDirectory {
    ArrayList<GODoc> GODocArrayList;

    public GODocDirectory() {
        GODocArrayList =new ArrayList<>();
    }
    public ArrayList<GODoc> getDeliveryManArrayList() {
        return GODocArrayList;
    }
    public GODoc createDeliverMan(String name,String usrname,String sex,Hospital hospital){
        GODoc GODoc =new GODoc();
        GODoc.setName(name);
        GODoc.setSex(sex);
        GODoc.setHospital(hospital);
        GODoc.setUsrname(usrname);
        GODocArrayList.add(GODoc);
        return GODoc;
    }

    public void remove(String usrname){
        for(GODoc go:GODocArrayList){
            if(go.getUsrname().equals(usrname)){
                GODocArrayList.remove(go);
            }
        }
    }

    public GODoc search(String usrname){
        for(GODoc go:GODocArrayList){
            if(go.getUsrname().equals(usrname)){
                return go;
            }
        }
        return null;
    }
}
