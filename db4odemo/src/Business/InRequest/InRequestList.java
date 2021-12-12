/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.InRequest;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class InRequestList {
    
    private ArrayList<InRequest> inRequestList;

    public InRequestList() {
        inRequestList = new ArrayList();
    }

    public ArrayList<InRequest> getWorkRequestList() {
        return inRequestList;
    }
}