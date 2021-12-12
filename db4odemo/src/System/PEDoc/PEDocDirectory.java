/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.PEDoc;

import System.GODoc.GODoc;
import System.Hospital.Hospital;
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

    public PEDoc createEmployee(String name,String usrname,String sex,Hospital hospital){
        PEDoc PEDoc = new PEDoc();
        PEDoc.setName(name);
        PEDoc.setHospital(hospital);
        PEDoc.setStatu("Free");
        PEDoc.setUsrname(usrname);
        PEDoc.setSex(sex);
        PEDocList.add(PEDoc);

        return PEDoc;
    }

    public void remove(String usrname){
        for(PEDoc go:PEDocList){
            if(go.getUsrname().equals(usrname)){
                PEDocList.remove(go);
            }
        }
    }

    public PEDoc search(String usrname){
        if (PEDocList==null){
            return null;
        }
        for(PEDoc go:PEDocList){
            if(go.getUsrname().equals(usrname)){
                return go;
            }
        }
        return null;
    }
}