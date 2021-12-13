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
public class PRCContactDirectory {
    ArrayList<PRCContact> PRCContactList;

    public PRCContactDirectory() {
        PRCContactList = new ArrayList<>();
    }
    public PRCContact createPRC(String name){
        PRCContact PRCcontact = new PRCContact();
        PRCcontact.setName(name);
        PRCContactList.add(PRCcontact);
        return PRCcontact;
    }

    public ArrayList<PRCContact> getPRCtArrayList() {
        return PRCContactList;
    }

    public PRCContact searchContact(String name){
        for(PRCContact c:PRCContactList){
            if(c.getUsername().equals(name)){
                return c;
            }
        }
        return null;
    }
}
