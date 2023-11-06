package homework_week9;
/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterator.
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Programme_5ArrayUsingIterator {
    public static void main(String[] args) {
        Programme_5ArrayUsingIterator obj = new Programme_5ArrayUsingIterator();
        obj.arraymethod();
    }

    public void arraymethod() {
        Set<Integer> list = new HashSet();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Iterator itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
