package System.Community;

import System.Government.Faculty;
import System.Hospital.Hospital;
import System.PRC.PRC;

import java.util.ArrayList;

public class Community
{
    public String name;
    public ArrayList<Hospital> hospitalArrayList;
    public ArrayList<PRC> prcArrayList;
    Faculty faculty;

    public Community(String name) {
        prcArrayList=new ArrayList<>();
        hospitalArrayList = new ArrayList<>();
        this.name=name;

    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Hospital> getHospitalArrayList() {
        return hospitalArrayList;
    }

    public void setHospitalArrayList(ArrayList<Hospital> hospitalArrayList) {
        this.hospitalArrayList = hospitalArrayList;
    }

    public ArrayList<PRC> getPrcArrayList() {
        return prcArrayList;
    }

    public void setPrcArrayList(ArrayList<PRC> prcArrayList) {
        this.prcArrayList = prcArrayList;
    }
}

