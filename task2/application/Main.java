package application;

import model.*;
import view.Console;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Sledge sledge1 = new Sledge();
        List<Child> childlist = new ArrayList<Child>();
        List<Presents> presentslist = new ArrayList<Presents>();

        String answer;
        String elfAnswer;
        String santaAnswer;
        do {
            answer = new Console().dialog();
            if (answer.equals("Child")) {
                childlist.add(addChild());
                new Console().dialogChildPresent();
                presentslist.add(addPresent());
            } else if (answer.equals("Elf")) {
                Elf elf = addElf();
                elfAnswer = new Console().dialogElf2();
                if (elfAnswer.equals("Sort")) {
                    elf.getSortedMap(childlist, presentslist);
                } else if (elfAnswer.equals("Add")) {
                    elf.addMapToSledge(elf.getSortedMap(childlist, presentslist), sledge1);
                } else if (elfAnswer.equals("Both")) {
                    elf.getSortedMap(childlist, presentslist);
                    elf.addMapToSledge(elf.getSortedMap(childlist, presentslist), sledge1);
                }
            } else if (answer.equals("Santa")) {
                Santa santa = addSanta();
                santaAnswer = new Console().dialogSanta2();
                if (santaAnswer.equals("See")) {
                    santa.showChilds(childlist);
                    santa.showPresents(presentslist);
                } else if (santaAnswer.equals("Check")) {
                    santa.checkIfSledgeIsLoaded(sledge1);
                } else if (santaAnswer.equals("Both")) {
                    santa.showChilds(childlist);
                    santa.showPresents(presentslist);
                    santa.checkIfSledgeIsLoaded(sledge1);
                }
            }
        } while (answer.equals("Child") || answer.equals("Elf"));





    /*    childlist.add(child1);
        presentslist.add(present1);
        childlist.add(child2);
        presentslist.add(present2);
        childlist.add(child3);
        presentslist.add(present3);
        elf1.addMapToSledge(elf1.getSortedMap(childlist, presentslist), sledge1);
        System.out.println();
    */
    }


    private static Presents addPresent() {
        return new Presents(stringAnswer());
    }


    public static String stringAnswer() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static int intAnswer() {
        Scanner input = new Scanner(System.in);
        return Integer.parseInt(input.nextLine());
    }

    public static Child addChild() {
        return new Child(stringAnswer(), intAnswer(), stringAnswer());

    }

    public static Elf addElf() {
        return new Elf(stringAnswer(), intAnswer());
    }

    public static Santa addSanta() {
        return new Santa();
    }

}