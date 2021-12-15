package System.Government;

import java.util.ArrayList;

public class FacultyDirectory {
    ArrayList<Faculty> facultyArrayList;

    public ArrayList<Faculty> getFacultyArrayList() {
        return facultyArrayList;
    }

    public void setFacultyArrayList(ArrayList<Faculty> facultyArrayList) {
        this.facultyArrayList = facultyArrayList;
    }

    public FacultyDirectory() {
        facultyArrayList=new ArrayList<>();
    }
}
