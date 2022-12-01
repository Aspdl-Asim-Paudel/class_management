import models.Group;
import models.Students;
import models.Teams;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Students st1 = new Students("Hare", 2324, 18, "sagarmatha");
        Students st2 = new Students("Krishna", 2404, 16, "api");
        Students st3 = new Students("Haree", 2409, 17, "saipal");
        Students st4 = new Students("Ram", 2343, 17, "sakura");
        Students st5 = new Students("Raam", 2312, 17, "Lobuche");
        Students st6 = new Students("Naam", 2469, 16, "Khunbila");

        ArrayList<Students> gradeTwelve = new ArrayList<Students>();
        gradeTwelve.add(st1);
        gradeTwelve.add(st4);
        gradeTwelve.add(st5);

        ArrayList<Students> gradeEleven = new ArrayList<Students>();
        gradeEleven.add(st2);
        gradeEleven.add(st3);
        gradeEleven.add(st6);

        Teams t1 = new Teams("Twelve", "A", 3, gradeTwelve);
        Teams t2 = new Teams("Eleven", "B", 3, gradeEleven);

        ArrayList<Teams> grA = new ArrayList<Teams>();
        ArrayList<Teams> grB = new ArrayList<Teams>();

        Group g1 = new Group(grA, "Group A");
        Group g2 = new Group(grB, "Group B");
    }
}