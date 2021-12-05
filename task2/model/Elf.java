package model;

import java.util.*;

public class Elf extends Person implements Comparator<Child> {

    public Elf(String name, int age) {
        super(name, age);
    }


    @Override
    public int compare(Child o1, Child o2) {
        return o1.placeOfResidence.compareTo(o2.placeOfResidence);
    }


    public TreeMap getSortedMap(List<Child> childlist, List<Presents> presentslist) {
        TreeMap<Child, Presents> hm = new TreeMap<>(new Comparator<Child>() {
            @Override
            public int compare(Child o1, Child o2) {
                return o1.getPlaceOfResidence().compareTo(o2.getPlaceOfResidence());
            }
        });
        for (int i = 0; i < childlist.size(); i++) {
            hm.put(childlist.get(i), presentslist.get(i));
        }
        return hm;
    }

    public void addMapToSledge(TreeMap<Child, Presents> hm, Sledge sledge) {
        sledge.sledge = new ArrayList<Presents>(hm.values());

        //  sledge.sledge.add((Presents) hm.values());


    }
}
