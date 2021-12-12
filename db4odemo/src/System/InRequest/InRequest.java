/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.InRequest;

import System.Hospital.Hospital;
import System.PRC.PRC;
import System.UserAccount.UserAccount;

import java.util.Date;

/**
 *
 * @author raunak
 */
public class InRequest {

    private UserAccount sender;
    //private UserAccount receiver;
    private String PrePeriod;
    private String status;
    private String requestDate;
    private String resolveDate;
    private int id;
    private Hospital hospital;
    private PRC prc;
    private static int count = 1;

    public InRequest() {
        this.id =count;
        count++;
        Date now= new Date();
    }

    

    public Hospital getRestaurant() {
        return hospital;
    }

    public void setRestaurant(Hospital hospital) {
        this.hospital = hospital;
    }

    public InRequest(UserAccount sender, String status, Hospital hospital,PRC prc,String preperiod) {
        this.sender = sender;
        //this.receiver = receiver;
        this.status = status;
        this.PrePeriod=preperiod;
        this.hospital = hospital;
        this.prc=prc;
        this.id =count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

//    public UserAccount getReceiver() {
//        return receiver;
//    }
//
//    public void setReceiver(UserAccount receiver) {
//        this.receiver = receiver;
//    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(String resolveDate) {
        this.resolveDate = resolveDate;
    }

    public String getPrePeriod() {
        return PrePeriod;
    }

    public void setPrePeriod(String PrePeriod) {
        this.PrePeriod = PrePeriod;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public PRC getPrc() {
        return prc;
    }

    public void setPrc(PRC prc) {
        this.prc = prc;
    }
    
    @Override
    public String toString() {
        return String.valueOf(id);
    }
    
}
