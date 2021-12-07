package model;

public class Person {
    String name = "";
    int age;
    String placeOfResidence = "";


    public Person(String name, int age, String placeOfResidence) {
        this.name = name;
        this.age = age;
        this.placeOfResidence = placeOfResidence;
    }

    public Person(String name, int age) {
        placeOfResidence = "North Pole";
    }

    public Person() {
        name = "Santa";
        age = 50;
        placeOfResidence = "North Pole";
    }

    public String getPlaceOfResidence() {
        return placeOfResidence;
    }

    public void setPlaceOfResidence(String placeOfResidence) {
        this.placeOfResidence = placeOfResidence;
    }
}
