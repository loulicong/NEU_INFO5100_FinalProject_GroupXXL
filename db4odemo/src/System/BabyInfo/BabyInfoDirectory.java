/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.BabyInfo;

import System.Baby.Baby;
import System.Pregnant.Pregnant;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author harold
 */
public class BabyInfoDirectory {
    ArrayList<BabyInfo> babyinfoArrayList;

    public BabyInfoDirectory() {
        babyinfoArrayList =new ArrayList<>();
    }
    public ArrayList<BabyInfo> getBabyInfoArrayList() {
        return babyinfoArrayList;
    }
    public BabyInfo createBabyInfo(String name, Date Birth, Pregnant mom, String description, String checkdate, Baby baby){
        BabyInfo babyinfo =new BabyInfo();
        babyinfo.setName(name);
        babyinfo.setBirth(Birth);
        babyinfo.setMom(mom);
        babyinfo.setDescription(description);
        babyinfo.setCheckdate(checkdate);
        babyinfo.setBaby(baby);
        babyinfoArrayList.add(babyinfo);
        return babyinfo;
    }
}
