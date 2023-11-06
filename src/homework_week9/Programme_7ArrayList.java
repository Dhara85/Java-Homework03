package homework_week9;
/**
 * Write a Java program to test if an array list is empty or not.
 */

import java.util.ArrayList;

public class Programme_7ArrayList {
    public static void main(String[] args) {
        arraylistEmpty();
    }

    public static void arraylistEmpty() {
        ArrayList<String> name = new ArrayList();
        name.add("Paul");
        name.add("Max");
        name.add("Christine");
        name.add("Victoria");
        name.add("Jennifer");
        name.add("Walter");

        if (name.isEmpty()) {
            System.out.println(name.isEmpty());
            System.out.println("The arraylist is empty");
        } else {
            System.out.println(name.isEmpty());
            System.out.println("The Arraylist is not empty");
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Arraylist name : \n" + name);
    }
}
