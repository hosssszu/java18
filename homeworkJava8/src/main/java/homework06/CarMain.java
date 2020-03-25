package homework06;

import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class CarMain {

    List<Car> carList = new ArrayList<>();
    Set<Car> carSet = new TreeSet<>(new CarComparator());
    public void addData() {

        // 1) Write 5 different instances of that object. Add the instances to a list.

        Car car1 = new Car("Opel", 12, "red");
        Car car2 = new Car("Nissan", 5, "white");
        Car car3 = new Car("VW", 4, "orange");
        Car car4 = new Car("Mustang", 8, "black");
        Car car5 = new Car("Maserati", 2, "blue");

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        System.out.println("Print all the list:");
        carList.forEach(System.out::println);
    }

    public Set<Car> getCars() {
        // 2) Find the elements containing the letter "a" that start with "M" and print them out. Add the instances to a set.

        Set<Car> myset = carList.stream()
                .filter((x) -> x.getModel().startsWith("M") && x.getModel().contains("a"))
                .collect(Collectors.toSet());
        System.out.println("Print elements which start with M and containing a:");
        System.out.println(myset);
        return myset;
    }

    public void min() {
        // 3) Find the "min" using a custom comparing criteria of choice

        Comparator<Car> comparator = Comparator.comparing(Car::getAge);
        Car minObject = carList.stream().min(comparator).get();
        System.out.println("minObject = " + minObject);
    }

    public void order(Set<Car> myset) {
        // 8) Sort the above List of custom objects (used for filter) in an order you consider

        carSet.addAll(myset);
        System.out.println("Print the list in order:");
        carSet.forEach(System.out::println);
    }

    public void match() {
        // 9) Check if any of your instances "match" a condition based on an Integer field (of your choice).

        boolean answer = carList
                .stream()
                .anyMatch(n -> n.getAge() == 2);
        System.out.println("Return type for the anyMatch() condition: " + answer);

        // anyMatch(), allMatch() and noneMatch() have the return type "boolean"
    }

    public void optional(Car car1) {
        // 10) What does Optional represent ? Explain through an example on your custom object
        // By using Optional, we can specify alternate values to return or alternate code to run to avoid the NullPointerException.

        Optional<String> carModel = Optional.of(car1.getModel());

        String answerOptional = null;
        System.out.println("Non empty Optional: " + carModel);
        System.out.println("Wrapper version1: " + Optional.ofNullable(carModel.get()));
        System.out.println("Wrapper version2: " + Optional.ofNullable(answerOptional));
        carModel.ifPresent(value -> System.out.println("Optional print value: " + carModel));
    }

}
