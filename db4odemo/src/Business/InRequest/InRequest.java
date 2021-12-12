/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.InRequest;

import Business.Hospital.Hospital;
import Business.PRC.PRC;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author raunak
 */
public class InRequest {

    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private int id;
    private Hospital hospital;
    private static int count = 1;
    private PRC prc;


    public PRC getPrc() {
        return prc;
    }

    public void setPrc(PRC prc) {
        this.prc = prc;
    }

    public Hospital getRestaurant() {
        return hospital;
    }

    public void setRestaurant(Hospital hospital) {
        this.hospital = hospital;
    }

    public InRequest(String message, UserAccount sender, UserAccount receiver, String status, Hospital hospital,PRC prc) {
        this.message = message;
        this.sender = sender;
        this.receiver = receiver;
        this.status = status;
        requestDate = new Date();
        this.hospital = hospital;
        this.id =count;
        this.prc=prc;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
}
