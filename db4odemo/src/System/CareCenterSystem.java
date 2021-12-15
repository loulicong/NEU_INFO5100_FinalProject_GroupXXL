/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;


import System.Baby.BabyDirectory;
import System.BabyInfo.BabyInfoDirectory;
import System.BabyNurse.BabyNurseDirectory;
import System.City.CityList;
import System.Community.CommunityList;
import System.GODNurse.GODNurseDirectory;
import System.Government.FacultyDirectory;
import System.Government.GovernmentDirectory;
import System.HospitalContact.HospitalContact;
import System.HospitalContact.HospitalContactDirectory;
import System.InRequest.InRequestList;
import System.PEDoc.PEDocDirectory;
import System.PRC.PRCDirectory;
import System.PRCContact.PRCContactDirectory;
import System.Pregnant.PregnantDirectory;
import System.GODoc.GODocDirectory;
import System.Hospital.HospitalDirectory;
import System.PregnantInfo.PregnantInfoDirectory;
import System.Role.Role;
import System.Role.SystemAdminRole;
import System.UserAccount.UserAccountDirectory;

import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class CareCenterSystem extends Organization{
    
    private static CareCenterSystem business;
    private HospitalDirectory hospitalDirectory;
    private PregnantDirectory pregnantDirectory;
    private GODocDirectory GODocDirectory;
    private InRequestList inRequestList;
    private PRCDirectory prcDirectory;
    private CityList cityList;
    private UserAccountDirectory userAccountDirectory;
    private GovernmentDirectory governmentDirectory;
    private FacultyDirectory facultyDirectory;
    private CommunityList communityList;
    private BabyDirectory babyDirectory;
    private HospitalContactDirectory hospitalContactDirectory;
    private PEDocDirectory PEdocDirectory;
    private HospitalContactDirectory hospitalcontactDirectory;
    private PRCContactDirectory PRCcontactDirectory;
    private BabyNurseDirectory babyNurseDirectory;
    private GODNurseDirectory godNurseDirectory;
    private PregnantInfoDirectory pregnantInfoDirectory;
    private BabyInfoDirectory babyInfoDirectory;

    public BabyInfoDirectory getBabyInfoDirectory() {
        return babyInfoDirectory;
    }

    public void setBabyInfoDirectory(BabyInfoDirectory babyInfoDirectory) {
        this.babyInfoDirectory = babyInfoDirectory;
    }

    public PregnantInfoDirectory getPregnantInfoDirectory() {
        return pregnantInfoDirectory;
    }

    public void setPregnantInfoDirectory(PregnantInfoDirectory pregnantInfoDirectory) {
        this.pregnantInfoDirectory = pregnantInfoDirectory;
    }

    public GODNurseDirectory getGodNurseDirectory() {
        return godNurseDirectory;
    }

    public void setGodNurseDirectory(GODNurseDirectory godNurseDirectory) {
        this.godNurseDirectory = godNurseDirectory;
    }

    public BabyNurseDirectory getBabyNurseDirectory() {
        return babyNurseDirectory;
    }

    public void setBabyNurseDirectory(BabyNurseDirectory babyNurseDirectory) {
        this.babyNurseDirectory = babyNurseDirectory;
    }

    public PRCContactDirectory getPRCcontactDirectory() {
        return PRCcontactDirectory;
    }

    public void setPRCcontactDirectory(PRCContactDirectory PRCcontactDirectory) {
        this.PRCcontactDirectory = PRCcontactDirectory;
    }

    public HospitalContactDirectory getHospitalcontactDirectory() {
        return hospitalcontactDirectory;
    }

    public void setHospitalcontactDirectory(HospitalContactDirectory hospitalcontactDirectory) {
        this.hospitalcontactDirectory = hospitalcontactDirectory;
    }

    public PEDocDirectory getPEdocDirectory() {
        return PEdocDirectory;
    }

    public void setPEdocDirectory(PEDocDirectory PEdocDirectory) {
        this.PEdocDirectory = PEdocDirectory;
    }

    public HospitalContactDirectory getHospitalContactDirectory() {
        return hospitalContactDirectory;
    }

    public void setHospitalContactDirectory(HospitalContactDirectory hospitalContactDirectory) {
        this.hospitalContactDirectory = hospitalContactDirectory;
    }

    public BabyDirectory getBabyDirectory() {
        return babyDirectory;
    }

    public void setBabyDirectory(BabyDirectory babyDirectory) {
        this.babyDirectory = babyDirectory;
    }

    public CommunityList getCommunityList() {
        return communityList;
    }

    public void setCommunityList(CommunityList communityList) {
        this.communityList = communityList;
    }

    public FacultyDirectory getFacultyDirectory() {
        return facultyDirectory;
    }

    public void setFacultyDirectory(FacultyDirectory facultyDirectory) {
        this.facultyDirectory = facultyDirectory;
    }

    public PregnantDirectory getPregnantDirectory() {
        return pregnantDirectory;
    }

    public void setPregnantDirectory(PregnantDirectory pregnantDirectory) {
        this.pregnantDirectory = pregnantDirectory;
    }

    public GovernmentDirectory getGovernmentDirectory() {
        return governmentDirectory;
    }

    public void setGovernmentDirectory(GovernmentDirectory governmentDirectory) {
        this.governmentDirectory = governmentDirectory;
    }

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

    public PRCDirectory getPRCDirectory() {
        return prcDirectory;
    }

    public void setPrcDirectory(PRCDirectory prcDirectory) {
        this.prcDirectory = prcDirectory;
    }

    public PregnantDirectory getUserDirectory() {
        return pregnantDirectory;
    }

    public void setUserDirectory(PregnantDirectory pregnantDirectory) {
        this.pregnantDirectory = pregnantDirectory;
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

    public static CareCenterSystem getBusiness() {
        return business;
    }

    public static void setBusiness(CareCenterSystem business) {
        CareCenterSystem.business = business;
    }


    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }


    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }


    public CareCenterSystem(HospitalDirectory hospitalDirectory, PregnantDirectory pregnantDirectory, GODocDirectory GODocDirectory, PRCDirectory prcDirectory, CityList cityList, GovernmentDirectory governmentDirectory, FacultyDirectory facultyDirectory, CommunityList communityList, BabyDirectory babyDirectory,HospitalContactDirectory hospitalContactDirectory) {

        this.hospitalDirectory = hospitalDirectory;
        this.pregnantDirectory = pregnantDirectory;
        this.GODocDirectory = GODocDirectory;
        this.prcDirectory = prcDirectory;
        this.cityList = cityList;
        this.governmentDirectory=governmentDirectory;
        this.facultyDirectory=facultyDirectory;
        this.communityList = communityList;
        this.babyDirectory = babyDirectory;
        this.hospitalContactDirectory = hospitalContactDirectory;
    }

    @Override
    public InRequestList getWorkQueue() {
        return inRequestList;
    }

    @Override
    public void setWorkQueue(InRequestList inRequestList) {
        this.inRequestList = inRequestList;
    }

    public static CareCenterSystem getInstance(){
        if(business==null){
            business=new CareCenterSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private CareCenterSystem(){
        super(null);
       // networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
