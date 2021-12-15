/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.InRequest;

import System.Baby.Baby;
import System.BabyNurse.BabyNurse;
import System.City.City;
import System.Community.Community;
import System.GODNurse.GODNurse;
import System.GODoc.GODoc;
import System.Hospital.Hospital;
import System.PEDoc.PEDoc;
import System.PRC.PRC;
import System.Pregnant.Pregnant;
import System.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author raunak
 */
public class InRequestList {

    private ArrayList<InRequest> inRequestList;

    public InRequestList() {
        inRequestList = new ArrayList();
    }

    public ArrayList<InRequest> getRequestList() {
        return inRequestList;
    }

    public InRequest createRequest(UserAccount sender,
                                   String PrePeriod,String status,String requestDate,String resolveDate,
                                   Hospital hospital,PRC prc){
        InRequest requestin =new InRequest();
        requestin.setSender(sender);
        //requestin.setReceiver(receiver);
        requestin.setPrePeriod(PrePeriod);
        requestin.setStatus(status);
        requestin.setRequestDate(requestDate);
        requestin.setResolveDate(resolveDate);
        requestin.setHospital(hospital);
        requestin.setPrc(prc);


        inRequestList.add(requestin);
        return requestin;
    }

    public InRequest searchRequest(Hospital hospital){
        if (inRequestList==null){
            return null;
        }
        for(InRequest r:inRequestList){
            if(r.getHospital().getName().equals(hospital.getName())){
                return r;
            }
        }
        return null;
    }

    public InRequest searchPRCRequest(PRC prc){
        if (prc==null){
            return null;
        }
        for(InRequest r:inRequestList){
            if(r.getPrc().getName().equals(prc.getName())){
                return r;
            }
        }
        return null;
    }

    public InRequest searchRequestasPregnant(String username){
        if (inRequestList==null){
            return null;
        }
        for(InRequest r:inRequestList){
            if(r.getSender().getUsername().equals(username)){
                return r;
            }
        }
        return null;
    }
    public InRequest searchById(int id){
        if (inRequestList==null){
            return null;
        }
        for(InRequest r:inRequestList){
            if(r.getId()==id){
                return r;
            }
        }
        return null;
    }
}