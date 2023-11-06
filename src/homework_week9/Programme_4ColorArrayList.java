package homework_week9;
/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

import java.util.ArrayList;

public class Programme_4ColorArrayList {

    public static void main(String[] args) {
        Programme_4ColorArrayList obj = new Programme_4ColorArrayList();
        obj.colourList();
    }

    public void colourList() {
        ArrayList<String> colour = new ArrayList();

        colour.add("Red");
        colour.add("Yellow");
        colour.add("Black");
        colour.add("Pink");
        colour.add("Purple");

        for (String colorlist : colour) {
            System.out.println(colorlist);

        }
    }
}


