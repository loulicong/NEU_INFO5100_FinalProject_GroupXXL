/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.User.UserDirectory;
import Business.GODoc.GODocDirectory;
import Business.Hospital.HospitalDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccountDirectory;
import Business.InRequest.InRequestList;

import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private HospitalDirectory hospitalDirectory;
    private UserDirectory userDirectory;
    private GODocDirectory GODocDirectory;
    private InRequestList inRequestList;
    private UserAccountDirectory userAccountDirectory;

    @Override
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }

    public HospitalDirectory getRestaurantDirectory() {
        return hospitalDirectory;
    }

    public void setRestaurantDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public UserDirectory getCustomerDirectory() {
        return userDirectory;
    }

    public void setCustomerDirectory(UserDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

    public GODocDirectory getDeliveryManDirectory() {
        return GODocDirectory;
    }

    public void setDeliveryManDirectory(GODocDirectory GODocDirectory) {
        this.GODocDirectory = GODocDirectory;
    }

    public EcoSystem(HospitalDirectory hospitalDirectory, UserDirectory userDirectory, GODocDirectory GODocDirectory) {

        this.hospitalDirectory = hospitalDirectory;
        this.userDirectory = userDirectory;
        this.GODocDirectory = GODocDirectory;
    }

    @Override
    public InRequestList getWorkQueue() {
        return inRequestList;
    }

    @Override
    public void setWorkQueue(InRequestList inRequestList) {
        this.inRequestList = inRequestList;
    }

    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
       // networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
