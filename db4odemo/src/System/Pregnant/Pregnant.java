/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Pregnant;

import System.Baby.Baby;
import System.BabyNurse.BabyNurse;
import System.City.City;
import System.Community.Community;
import System.GODNurse.GODNurse;
import System.GODoc.GODoc;
import System.Hospital.Hospital;
import System.InRequest.InRequest;
import System.PEDoc.PEDoc;
import System.PRC.PRC;
import System.PregnantInfo.PregnantInfo;
import System.PregnantInfo.PregnantInfoDirectory;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Pregnant {
    private String name;
    private String username;
    private int id;
    private int age;
    private Community community;
    private City city;
    private String InPreDate;
    private ArrayList<Baby> babyArrayList;
    private String Emergence;
    private Hospital hospital;
    private PRC prc;
    private GODoc GODoc;
    private PEDoc PEDoc;
    private GODNurse GODNurse;
    private BabyNurse BabyNurse;
    private ArrayList<InRequest> HospitalinrequestList;
    private ArrayList<InRequest> PRCinrequestList;
    private String Hospitalstatu;
    private String PRCstatu;
    private ArrayList<PregnantInfo> pregnantInfoArrayList;


    private static int count = 1;

    public ArrayList<PregnantInfo> getPregnantInfoArrayList() {
        return pregnantInfoArrayList;
    }

    public void setPregnantInfoArrayList(ArrayList<PregnantInfo> pregnantInfoArrayList) {
        this.pregnantInfoArrayList = pregnantInfoArrayList;
    }

    public Pregnant() {
        babyArrayList = new ArrayList<>();
        HospitalinrequestList=new ArrayList<>();
        PRCinrequestList=new ArrayList<>();
        pregnantInfoArrayList = new ArrayList<>();
        //this.pregnantinfoDirectory=new PregnantInfoDirectory();
        //pregnantinfoDirectory=new ArrayList<PregnantInfo>();
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getInPreDate() {
        return InPreDate;
    }

    public void setInPreDate(String InPreDate) {
        this.InPreDate = InPreDate;
    }

    public ArrayList<Baby> getBabyArrayList() {
        return babyArrayList;
    }

    public void setBabyArrayList(ArrayList<Baby> babyArrayList) {
        this.babyArrayList = babyArrayList;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Pregnant.count = count;
    }

    public String getEmergence() {
        return Emergence;
    }

    public void setEmergence(String Emergence) {
        this.Emergence = Emergence;
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

    public GODoc getGODoc() {
        return GODoc;
    }

    public void setGODoc(GODoc GODoc) {
        this.GODoc = GODoc;
    }

    public PEDoc getPEDoc() {
        return PEDoc;
    }

    public void setPEDoc(PEDoc PEDoc) {
        this.PEDoc = PEDoc;
    }

    public GODNurse getGODNurse() {
        return GODNurse;
    }

    public void setGODNurse(GODNurse GODNurse) {
        this.GODNurse = GODNurse;
    }

    public BabyNurse getBabyNurse() {
        return BabyNurse;
    }

    public void setBabyNurse(BabyNurse BabyNurse) {
        this.BabyNurse = BabyNurse;
    }

    public ArrayList<InRequest> getHospitalinrequestList() {
        return HospitalinrequestList;
    }

    public void setHospitalinrequestList(ArrayList<InRequest> HospitalinrequestList) {
        this.HospitalinrequestList = HospitalinrequestList;
    }

    public ArrayList<InRequest> getPRCinrequestList() {
        return PRCinrequestList;
    }

    public void setPRCinrequestList(ArrayList<InRequest> PRCinrequestList) {
        this.PRCinrequestList = PRCinrequestList;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHospitalstatu() {
        return Hospitalstatu;
    }

    public void setHospitalstatu(String Hospitalstatu) {
        this.Hospitalstatu = Hospitalstatu;
    }

    public String getPRCstatu() {
        return PRCstatu;
    }

    public void setPRCstatu(String PRCstatu) {
        this.PRCstatu = PRCstatu;
    }






    @Override
    public String toString() {
        return name;
    }
}
