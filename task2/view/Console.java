package view;

import java.util.Scanner;

public class Console {
    /*
     * the console dialog comes here
     */
    public String dialog() {
        System.out.println("Pleas login:");
        String answer = stringAnswer();
        if (answer.equals("Child")) {
            dialogChild();
        } else if (answer.equals("Elf")) {
            dialogElf();
        } else if (answer.equals("Santa")) {
            dialogSanta();
        } else
            System.out.println("Sorry you didnt log in correct. Please try again");
        return answer;
    }

    public void dialogChild() {
        System.out.println("Hello there, please enter your name,age and your place of residence");

    }

    public void dialogChildPresent() {
        System.out.println("Now enter the present that you wish");

    }

    public void dialogElf() {
        System.out.println("Hi there please state your name and age");

    }

    public String dialogElf2() {

        System.out.println("Now you can sort the Presents by place of residence by the Child");
        System.out.println("You can also add the presents to the sledge");
        System.out.println("Answer: Sort , Add or Both for whatever you want to do");
        return stringAnswer();
    }

    public void dialogSanta() {
        System.out.println("Hi Santa hope you are doing well today");
    }

    public String dialogSanta2() {
        System.out.println("You can see all the presents and the kids");
        System.out.println("You can also check if the sledge is already loaded");
        System.out.println("Answer: See,Check or Both for whatever you want to do");
        return stringAnswer();
    }

    public String stringAnswer() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public int intAnswer() {
        Scanner input = new Scanner(System.in);
        return Integer.parseInt(input.nextLine());
    }
}
