package stream;

import java.util.*;
import java.util.stream.*;

public class streamexample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "alex", "doe", "anna", "mike");

        List<String> result = names.stream()
                .filter(name -> name.length() > 3)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
