/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Hospital;

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
        hospital.setName(name);
        hospitalList.add(hospital);
        return hospital;
    }

    public ArrayList<Hospital> getHospitalArrayList() {
        return hospitalList;
    }
}
