package homework06;

import java.util.*;
import java.util.stream.Collectors;

public class StringGenerator {

    // 4) Generate 5 random Strings and add them to a Set. Find the "max".
    TreeSet<String> setList = new TreeSet<>();

    public String generateRandomString(Random random) {
        return random.ints(58, 122)
                .filter(i -> (i < 57 || i > 65) && (i < 90 || i > 97))
                .mapToObj(i -> (char) i)
                .limit(5)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }

    public void createSet() {

        for (int i = 0; i < 5; i++) {
            StringGenerator stringGenerator = new StringGenerator();
            Random random = new Random();
            setList.add(stringGenerator.generateRandomString(random));
        }
        System.out.println("Set with 5 random String:" + setList);

        Optional<String> maxElement = setList.stream()
                .sorted()
                .max(Comparator.comparing(String::valueOf));
        System.out.println("The max element from the stream: " + maxElement.get());

    }

    public void reverseOrder() {
        // 7) Sort the above Set<String> (used for max) in reverse order

        Set<String> reverse = setList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println("Reverse order: " + reverse);
    }

    public void shortestString() {
        // 11) Fastest way to find the shortest String in a List
        // (take the 5 random Strings generated above and find the shortest one).

        Optional<String> shortestString = setList.stream().min(Comparator.comparing(String::valueOf));
        System.out.println("Shortest string: " + shortestString);
    }

}
