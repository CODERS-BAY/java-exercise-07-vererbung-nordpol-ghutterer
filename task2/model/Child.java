package model;

import java.util.ArrayList;
import java.util.List;

public class Child extends Person {
    Presents present;

    public Child(String name, int age, String placeOfResidence) {
        super(name, age, placeOfResidence);
    }


    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", placeOfResidence='" + placeOfResidence + '\'' +
                '}';
    }


}

