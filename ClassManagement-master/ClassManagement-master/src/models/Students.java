package models;

public class Students {
    public Students(String name, int id, int age, String section) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.section = section;
    }

    String name;
    int id;
    int age;
    String section;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
