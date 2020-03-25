package homework06;

import java.util.*;

public class Number {

    // 5) Generate a random number of Integers and then count them.
    // "Map" the exponential to the numbers and then print them out.

    public void random() {

        Random r1 = new Random();
        int temp = r1.nextInt(5);
        System.out.println("Random number generated: " + temp);

        List<Integer> myList = new ArrayList<>();

        int number;
        System.out.print("Original number/s: [");
        for (int i = 0; i < temp; i++) {
            number = r1.nextInt(10);
            myList.add(number);
            System.out.print(number + " ");
        }
        System.out.print("]\n");

        myList
                .stream()
                .map(s -> Math.exp(s))
                .forEach(System.out::println);

    }

    // 6) Create a map of "n" (K,V) elements and print "how many" elements have value over 10.

    public void map() {

        Map<Integer, Double> map = new LinkedHashMap<>();

        for (int i = 1; i <= 5; i++) {
            double j = Math.pow(i, 2);
            map.put(i, j);
        }

        System.out.println("Original map: " + map);

        Collection<Double> keySet = map.values();

        long total = keySet.stream()
                .filter(s -> s > 10)
                .count();

        System.out.println("Total elements with higher values than 10 are: " + total);

    }
}
