package System.City;

import System.Community.Community;
import System.Government.Government;

import java.util.ArrayList;

public class City {
    private String name;
    private Government government;
    private ArrayList<Community> communityArrayList;

    public City(String name) {
        this.government = new Government();
        this.name = name;
        this.communityArrayList=new ArrayList<>();

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Community> getCommunityArrayList() {
        return communityArrayList;
    }

    public void setCommunityArrayList(ArrayList<Community> communityArrayList) {
        this.communityArrayList = communityArrayList;
    }
}
