/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Hospital;

import System.Hospital_GO.Hospital_GO;
import System.Hospital_PED.Hospital_PED;
import System.Community.Community;
import System.GODoc.GODoc;
import System.PEDoc.PEDoc;
import System.Pregnant.Pregnant;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class HospitalDirectory {
    ArrayList<Hospital> hospitalList;

    public HospitalDirectory() {
        hospitalList = new ArrayList<>();
    }
    public Hospital createHospital(String name){
        Hospital hospital = new Hospital();

        hospitalList.add(hospital);
        return hospital;
    }


    public ArrayList<Hospital> getHospitalArrayList() {
        return hospitalList;
    }

    public Hospital searchHospital(String name){
        for(Hospital h:hospitalList){
            if(h.getName().equals(name)){
                return h;
            }
        }
        return null;

    }
}
