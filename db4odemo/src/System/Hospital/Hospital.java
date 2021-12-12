/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Hospital;

import System.HospitalContact.HospitalContact;
import System.Hospital_GO.Hospital_GO;
import System.Hospital_PED.Hospital_PED;
import System.Community.Community;
import System.InRequest.InRequestList;

/**
 *
 * @author harold
 */
public class Hospital {
    private String name;
    private int id;
    private static int count = 1;
    private Community community;
    private Hospital_GO Hospital_GO;
    private Hospital_PED Hospital_PED;
    private InRequestList inrequestDirectory;
    private HospitalContact hospitalContact;


    public Hospital() {
        id = count;
        inrequestDirectory = new InRequestList();
        hospitalContact = new HospitalContact();
        Hospital_GO = new Hospital_GO();
        Hospital_PED = new Hospital_PED();
        count++;
    }

    public HospitalContact getHospitalContact() {
        return hospitalContact;
    }

    public void setHospitalContact(HospitalContact hospitalContact) {
        this.hospitalContact = hospitalContact;
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

    public Hospital_GO getHospital_GO() {
        return Hospital_GO;
    }

    public void setHospital_GO(Hospital_GO Hospital_GO) {
        this.Hospital_GO = Hospital_GO;
    }

    public Hospital_PED getHospital_PED() {
        return Hospital_PED;
    }

    public void setHospital_PED(Hospital_PED Hospital_PED) {
        this.Hospital_PED = Hospital_PED;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public InRequestList getInrequestDirectory() {
        return inrequestDirectory;
    }

    public void setInrequestDirectory(InRequestList inrequestDirectory) {
        this.inrequestDirectory = inrequestDirectory;
    }




    @Override
    public String toString() {
        return name;
    }
}
