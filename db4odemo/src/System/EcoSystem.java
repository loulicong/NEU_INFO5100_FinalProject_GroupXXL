/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;


import System.City.CityList;
import System.PRC.PRCDirectory;
import System.User.UserDirectory;
import System.GODoc.GODocDirectory;
import System.Hospital.HospitalDirectory;
import System.Role.Role;
import System.Role.SystemAdminRole;
import System.UserAccount.UserAccountDirectory;
import System.InRequest.InRequestList;

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
    private PRCDirectory prcDirectory;
    private CityList cityList;
    private UserAccountDirectory userAccountDirectory;

    public GODocDirectory getGODocDirectory() {
        return GODocDirectory;
    }

    public void setGODocDirectory(GODocDirectory GODocDirectory) {
        this.GODocDirectory = GODocDirectory;
    }

    public CityList getCityList() {
        return cityList;
    }

    public void setCityList(CityList cityList) {
        this.cityList = cityList;
    }

    public PRCDirectory getPrcDirectory() {
        return prcDirectory;
    }

    public void setPrcDirectory(PRCDirectory prcDirectory) {
        this.prcDirectory = prcDirectory;
    }

    public UserDirectory getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(UserDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

    public InRequestList getInRequestList() {
        return inRequestList;
    }

    public void setInRequestList(InRequestList inRequestList) {
        this.inRequestList = inRequestList;
    }

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

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }


    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }


    public EcoSystem(HospitalDirectory hospitalDirectory, UserDirectory userDirectory, GODocDirectory GODocDirectory,PRCDirectory prcDirectory,CityList cityList) {

        this.hospitalDirectory = hospitalDirectory;
        this.userDirectory = userDirectory;
        this.GODocDirectory = GODocDirectory;
        this.prcDirectory = prcDirectory;
        this.cityList = cityList;
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
