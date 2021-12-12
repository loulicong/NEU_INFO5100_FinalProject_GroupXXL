/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.PEDoc;

import System.Hospital.Hospital;
import System.Pregnant.Pregnant;

/**
 *
 * @author raunak
 */
public class PEDoc {

    private String name;
    private int id;
    private String Sex;
    private Hospital hospital;
    private String statu;
    private static int count = 1;
    private String usrname;
    private String password;
    private Pregnant pregnant;

    public PEDoc() {
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

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu;
    }

    public String getUsrname() {
        return usrname;
    }

    public void setUsrname(String usrname) {
        this.usrname = usrname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }



    @Override
    public String toString() {
        return name;
    }


}
