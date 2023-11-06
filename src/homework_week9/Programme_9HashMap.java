package homework_week9;
/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;
import java.util.Map;

public class Programme_9HashMap {
    public static void main(String[] args) {
        Programme_9HashMap obj = new Programme_9HashMap();
        obj.hashMapMethod();
    }

    public void hashMapMethod() {
        Map<Integer, String> people = new HashMap<>();
        people.put(1, "John");
        people.put(2, "Mary");
        people.put(3, "Max");
        people.put(4, "Katherine");

        for (Map.Entry<Integer, String> peopleName : people.entrySet()) {
            System.out.println(peopleName);
        }
    }
}
