/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.HospitalContact;

import System.PRC.*;
import System.BabyNurse.BabyNurse;
import System.GODNurse.GODNurse;
import System.Hospital.Hospital;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class HospitalContact {
    private Hospital hospital;
    private String username;
    private String name;
    private int id;
    private static int count = 1;



    public HospitalContact() {
        id = count;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
