/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.OutRequest;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OutRequestList {
    
    private ArrayList<OutRequest> outRequestList;

    public OutRequestList() {
        outRequestList = new ArrayList();
    }

    public ArrayList<OutRequest> getWorkRequestList() {
        return outRequestList;
    }
}