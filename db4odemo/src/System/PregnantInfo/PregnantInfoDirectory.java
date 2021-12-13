/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.PregnantInfo;

import System.Pregnant.Pregnant;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class PregnantInfoDirectory {
    ArrayList<PregnantInfo> pregnantinfoArrayList;

    public PregnantInfoDirectory() {
        pregnantinfoArrayList =new ArrayList<>();
    }
    public ArrayList<PregnantInfo> getPregnantInfoArrayList() {
        return pregnantinfoArrayList;
    }
    public PregnantInfo createPregnanInfo(String description,String checkdate,String image,Pregnant p){
        PregnantInfo pregnantinfo =new PregnantInfo();
        pregnantinfo.setDescription(description);
        pregnantinfo.setCheckdate(checkdate);
        pregnantinfo.setImage(image);
        pregnantinfo.setPregnant(p);
        pregnantinfoArrayList.add(pregnantinfo);
        return pregnantinfo;
    }

}
