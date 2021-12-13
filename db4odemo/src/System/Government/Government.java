package System.Government;

import System.City.City;

import java.util.ArrayList;

public class Government {
    City city;
    String username;
    ArrayList<Faculty> facultyArrayList;


    public Government() {
        facultyArrayList = new ArrayList<>();
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public ArrayList<Faculty> getFacultyArrayList() {
        return facultyArrayList;
    }

    public void setFacultyArrayList(ArrayList<Faculty> facultyArrayList) {
        this.facultyArrayList = facultyArrayList;
    }
}
