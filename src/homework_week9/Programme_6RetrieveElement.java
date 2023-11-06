package homework_week9;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6RetrieveElement {
    public static void main(String[] args) {
        Programme_6RetrieveElement obj = new Programme_6RetrieveElement();
        obj.retrieveElement();
    }
    public void retrieveElement() {
        ArrayList<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        System.out.println("Original Days list :\n" + days);
        System.out.println("=============================================================");

        String element = days.get(1);
        System.out.println("Second element : " + element);

        element = days.get(4);
        System.out.println("Fifth element : " + element);
    }
}
