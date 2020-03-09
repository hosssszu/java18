package homework05;

import java.util.Set;

public class IOMain {
    public static void main(String[] args) {
        String csvFile = "Book.csv";
        PeopleCSVReader peopleCSVReader = new PeopleCSVReader();
        Set<People> personList = peopleCSVReader.readPeople(csvFile);
    }
}
