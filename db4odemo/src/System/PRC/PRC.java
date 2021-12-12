/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.PRC;

import System.PRC_GO.PRC_GO;
import System.PRC_PED.PRC_PED;
import System.BabyNurse.BabyNurse;
import System.Community.Community;
import System.GODNurse.GODNurse;
import System.InRequest.InRequestList;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class PRC {
    private String name;
    private Community community;
    int id;
    private static int count = 1;
    private PRC_GO PRC_GO;
    private PRC_PED PRC_PED;
    private InRequestList inrequestDirectory;


    public PRC() {
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

    public PRC_GO getPRC_GO() {
        return PRC_GO;
    }

    public void setPRC_GO(PRC_GO PRC_GO) {
        this.PRC_GO = PRC_GO;
    }

    public PRC_PED getPRC_PED() {
        return PRC_PED;
    }

    public void setPRC_PED(PRC_PED PRC_PED) {
        this.PRC_PED = PRC_PED;
    }



    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public InRequestList getInrequestDirectory() {
        return inrequestDirectory;
    }

    public void setInrequestDirectory(InRequestList inrequestDirectory) {
        this.inrequestDirectory = inrequestDirectory;
    }



    @Override
    public String toString() {
        return name;
    }

}
