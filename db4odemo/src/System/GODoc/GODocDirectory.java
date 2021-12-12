/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.GODoc;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class GODocDirectory {
    ArrayList<GODoc> GODocArrayList;

    public GODocDirectory() {
        GODocArrayList =new ArrayList<>();
    }
    public ArrayList<GODoc> getDeliveryManArrayList() {
        return GODocArrayList;
    }
    public GODoc createDeliverMan(String name){
        GODoc GODoc =new GODoc();
        GODoc.setName(name);
        GODocArrayList.add(GODoc);
        return GODoc;
    }
}
