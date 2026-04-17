package hashmap;

import java.util.*;

public class mapexample {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        students.put(1, "John");
        students.put(2, "Alice");
        students.put(3, "Bob");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
