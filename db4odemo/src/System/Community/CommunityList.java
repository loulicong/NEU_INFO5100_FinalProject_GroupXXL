package System.Community;

import java.util.ArrayList;

public class CommunityList {
    ArrayList<Community> communityArrayList;

    public ArrayList<Community> getCommunityArrayList() {
        return communityArrayList;
    }

    public void setCommunityArrayList(ArrayList<Community> communityArrayList) {
        this.communityArrayList = communityArrayList;
    }

    public CommunityList() {
        this.communityArrayList = new ArrayList<>();
    }
}
