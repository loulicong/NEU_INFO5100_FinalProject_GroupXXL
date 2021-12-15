/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.PregnantInfo;

import System.Pregnant.Pregnant;

/**
 *
 * @author harold
 */
public class PregnantInfo {
    private int id;
    private static int count = 1;
    private String checkdate;
    private String description;
    private String image;
    private Pregnant pregnant;

    public PregnantInfo() {
        id = count;
        count++;
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
        PregnantInfo.count = count;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(String checkdate) {
        this.checkdate = checkdate;
    }

    public Pregnant getPregnant() {
        return pregnant;
    }

    public void setPregnant(Pregnant pregnant) {
        this.pregnant = pregnant;
    }




    @Override
    public String toString() {
        return checkdate;
    }

}
