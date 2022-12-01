package models;

import java.util.ArrayList;

public class Teams {
    public Teams(String name, String group, int members, ArrayList<Students> students) {
        this.name = name;
        this.group = group;
        this.members = members;
        this.students = students;
    }

    String name;
    String group;
    int members;
    ArrayList<Students> students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public ArrayList<Students> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Students> students) {
        this.students = students;
    }
}
