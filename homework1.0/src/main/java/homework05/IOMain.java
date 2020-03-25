package homework05;

/**
 * Write a software that takes as an input a CSV file where every entry represents the results of a biathlon athlete.
 * Based on the entries identify the first 3 places (Winner, Runner-up and Third Place).
 * The rules are simple, each athlete has a time-result for the entire skiing session, and 3 shooting range results.
 * Each shooting range has 5 shot results. For every missed shot the athlete obtains a 10 second penalty which affects the final time-result.
 * Final standings are based on the time-results that have been updated with the shooting range results.
 *
 *
 * @author Loránd
 */

import java.util.Set;

public class IOMain {
    public static void main(String[] args) {
        String csvFile = "Book.csv";
        PeopleCSVReader peopleCSVReader = new PeopleCSVReader();
        Set<People> personList = peopleCSVReader.readPeople(csvFile);
    }
}
