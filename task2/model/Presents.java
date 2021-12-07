package model;

import java.util.ArrayList;
import java.util.List;

public class Presents {

    String present = "";

    public Presents(String present) {
        this.present = present;
    }


    @Override
    public String toString() {
        return "Presents{" +
                "present='" + present + '\'' +
                '}';
    }
}
