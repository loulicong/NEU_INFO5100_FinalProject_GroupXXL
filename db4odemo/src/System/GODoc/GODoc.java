/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.GODoc;

import System.Hospital.Hospital;
import System.Pregnant.Pregnant;
import System.UserAccount.UserAccount;
import userinterface.PregnantRole.PregnantMain;

/**
 *
 * @author harold
 */
public class GODoc {
    private String name;
    private String usrname;
    private String Sex;
    private int id;
    private Hospital hospital;
    private String statu;
    private String password;
    private Pregnant pregnant;

    private static int count = 1;

    public GODoc() {
        id = count;
        count++;
    }

    public Pregnant getPregnant() {
        return pregnant;
    }

    public void setPregnant(Pregnant pregnant) {
        this.pregnant = pregnant;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getUsrname() {
        return usrname;
    }

    public void setUsrname(String usrname) {
        this.usrname = usrname;
    }

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }





    @Override
    public String toString() {
        return name;
    }

}
