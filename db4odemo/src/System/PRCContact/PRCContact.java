/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.PRCContact;

import System.HospitalContact.*;
import System.PRC.*;
import System.BabyNurse.BabyNurse;
import System.GODNurse.GODNurse;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class PRCContact {
    String name;
    int id;
    private static int count = 1;
    private String username;
    private PRC prc;




    public PRCContact() {
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public PRC getPrc() {
        return prc;
    }

    public void setPrc(PRC prc) {
        this.prc = prc;
    }



}
