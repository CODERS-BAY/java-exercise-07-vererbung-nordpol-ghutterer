package model;

import java.util.List;

public class Santa extends Person {

    public Santa() {
    }

    public void showChilds(List<Child> childlist) {
        for (Child c : childlist) {
            System.out.println(c);
        }
    }

    public void showPresents(List<Presents> presentlist) {
        for (Presents s : presentlist) {
            System.out.println(s);
        }
    }

    public void checkIfSledgeIsLoaded(Sledge sledge) {
        if (sledge.sledge.size() > 0)
            System.out.println("The sledge is loaded and ready to go");
        else
            System.out.println("The sledge is not loaded yet");
    }

}
