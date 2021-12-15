package System.Government;

import java.util.ArrayList;

public class GovernmentDirectory {
    ArrayList<Government> governmentArrayList;

    public ArrayList<Government> getGovernmentArrayList() {
        return governmentArrayList;
    }

    public void setGovernmentArrayList(ArrayList<Government> governmentArrayList) {
        this.governmentArrayList = governmentArrayList;
    }

    public GovernmentDirectory() {
        governmentArrayList=new ArrayList<>();
    }
}
