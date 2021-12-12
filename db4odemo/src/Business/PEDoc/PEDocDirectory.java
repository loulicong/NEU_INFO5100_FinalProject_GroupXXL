/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PEDoc;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class PEDocDirectory {
    
    private ArrayList<PEDoc> PEDocList;

    public PEDocDirectory() {
        PEDocList = new ArrayList();
    }

    public ArrayList<PEDoc> getEmployeeList() {
        return PEDocList;
    }
    
    public PEDoc createEmployee(String name){
        PEDoc PEDoc = new PEDoc();
        PEDoc.setName(name);
        PEDocList.add(PEDoc);
        return PEDoc;
    }
}