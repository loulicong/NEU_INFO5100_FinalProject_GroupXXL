/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.PRC;

import System.PRC_GO.PRC_GO;
import System.PRC_PED.PRC_PED;
import System.BabyNurse.BabyNurse;
import System.Community.Community;
import System.GODNurse.GODNurse;
import System.Hospital.Hospital;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class PRCDirectory {
    ArrayList<PRC> PRCList;

    public PRCDirectory() {
        PRCList = new ArrayList<>();

    }
    public PRC createPRC(String name,Community community,
                         PRC_GO PRC_GO,PRC_PED PRC_PED){
        PRC prc = new PRC();
        prc.setName(name);
        prc.setPRC_GO(PRC_GO);
        prc.setPRC_PED(PRC_PED);
        prc.setCommunity(community);

        PRCList.add(prc);
        return prc;
    }

    public ArrayList<PRC> getPRCtArrayList() {
        return PRCList;
    }

    public PRC searchPRC(String name){
        if(PRCList==null){
            return null;
        }
        for(PRC prc:PRCList){
            if(prc.getName().equals(name)){
                return prc;
            }
        }
        return null;

    }

    public ArrayList<PRC> getPRCList() {
        return PRCList;
    }

    public void setPRCList(ArrayList<PRC> PRCList) {
        this.PRCList = PRCList;
    }
}
