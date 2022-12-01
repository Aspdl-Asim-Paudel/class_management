package models;

import java.util.ArrayList;

public class Group {
    ArrayList<Teams> teams;
    String name;

    public ArrayList<Teams> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Teams> teams) {
        this.teams = teams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group(ArrayList<Teams> teams, String name) {
        this.teams = teams;
        this.name = name;
    }
}
