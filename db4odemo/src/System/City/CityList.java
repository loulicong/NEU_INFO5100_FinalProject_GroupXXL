package System.City;

import java.util.ArrayList;

public class CityList {
    private ArrayList<City> cityArrayList;

    public ArrayList<City> getCityArrayList() {
        return cityArrayList;
    }

    public void setCityArrayList(ArrayList<City> cityArrayList) {
        this.cityArrayList = cityArrayList;
    }

    public CityList() {
        this.cityArrayList = new ArrayList<>();
    }

}
