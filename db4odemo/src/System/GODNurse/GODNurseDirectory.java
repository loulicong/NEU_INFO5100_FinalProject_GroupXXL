/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.GODNurse;

import System.GODoc.GODoc;
import System.PRC.PRC;
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
    public GODNurse createDeliverMan(String name,String usrname,String sex,PRC prc){
        GODNurse GODNurse =new GODNurse();
        GODNurse.setName(name);
        GODNurse.setSex(sex);
        GODNurse.setPRC(prc);
        GODNurse.setUsrname(usrname);
        GODNurse.setStatu("Free");
        GODNurseArrayList.add(GODNurse);
        return GODNurse;
    }

    public void remove(String usrname){
        for(GODNurse go:GODNurseArrayList){
            if(go.getUsrname().equals(usrname)){
                GODNurseArrayList.remove(go);
            }
        }
    }

    public GODNurse search(String usrname){
        for(GODNurse go:GODNurseArrayList){
            if(go.getUsrname().equals(usrname)){
                return go;
            }
        }
        return null;
    }
}
