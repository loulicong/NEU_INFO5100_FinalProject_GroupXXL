/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.BabyInfo;

import System.Baby.Baby;
import System.Pregnant.Pregnant;

import java.util.Date;

/**
 *
 * @author harold
 */
public class BabyInfo {
    private String name;
    private int id;
    private static int count = 1;
    private Pregnant mom;
    private Date Birth;
    private String description;
    private String checkdate;
    private Baby baby;

    public BabyInfo() {
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

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        BabyInfo.count = count;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(String checkdate) {
        this.checkdate = checkdate;
    }

    public Baby getBaby() {
        return baby;
    }

    public void setBaby(Baby baby) {
        this.baby = baby;
    }

    
    
    
    

    
    
    @Override
    public String toString() {
        return name;
    }
    
}
