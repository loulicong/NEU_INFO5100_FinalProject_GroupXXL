/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.BabyNurse;

import System.PRC.PRC;
import System.Pregnant.Pregnant;

/**
 *
 * @author harold
 */
public class BabyNurse {
    private String name;
    private String usrname;
    private String Sex;
    private int id;
    private PRC PRC;
    private static int count = 1;
    private String statu;
    private String password;
    private Pregnant pregnant;

    public Pregnant getPregnant() {
        return pregnant;
    }

    public void setPregnant(Pregnant pregnant) {
        this.pregnant = pregnant;
    }

    public BabyNurse() {
        id = count;
        count++;
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



    public PRC getPRC() {
        return PRC;
    }

    public void setPRC(PRC PRC) {
        this.PRC = PRC;
    }

    public String getUsrname() {
        return usrname;
    }

    public void setUsrname(String usrname) {
        this.usrname = usrname;
    }


    @Override
    public String toString() {
        return name;
    }

}
