/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Baby;

import System.BabyInfo.BabyInfoDirectory;
import System.Pregnant.Pregnant;
import java.util.Date;

/**
 *
 * @author harold
 */
public class Baby {
    private String name;
    private int id;
    private static int count = 1;
    private Pregnant mom;
    private Date Birth;
    private BabyInfoDirectory babyinfoDirectory;

    public Baby() {
        id = count;
        count++;
        babyinfoDirectory = new BabyInfoDirectory();
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

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Baby.count = count;
    }

    public Pregnant getMom() {
        return mom;
    }

    public void setMom(Pregnant mom) {
        this.mom = mom;
    }

    public Date getBirth() {
        return Birth;
    }

    public void setBirth(Date Birth) {
        this.Birth = Birth;
    }


    public BabyInfoDirectory getBabyinfoDirectory() {
        return babyinfoDirectory;
    }

    public void setBabyinfoDirectory(BabyInfoDirectory babyinfoDirectory) {
        this.babyinfoDirectory = babyinfoDirectory;
    }


    @Override
    public String toString() {
        return name;
    }

}
