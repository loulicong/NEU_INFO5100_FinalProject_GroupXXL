/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.PRC;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class PRCDirectory {
    ArrayList<PRC> hospitalList;

    public PRCDirectory() {
        hospitalList = new ArrayList<>();
    }
    public PRC createPRC(String name){
        PRC hospital = new PRC();
        hospital.setName(name);
        hospitalList.add(hospital);
        return hospital;
    }

    public ArrayList<PRC> getPRCArrayList() {
        return hospitalList;
    }
}
