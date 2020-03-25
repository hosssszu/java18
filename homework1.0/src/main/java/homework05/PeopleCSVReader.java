package homework05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;


public class PeopleCSVReader implements Comparable<PeopleCSVReader> {
    Set<People> people = new TreeSet<>(new Comp());

    Set<People> readPeople(String fileName) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] tokens = line.split(",");

                People person = new People(
                        Integer.parseInt(tokens[0]),
                        tokens[1],
                        tokens[2],
                        tokens[3],
                        tokens[4],
                        tokens[5],
                        tokens[6]
                );
                people.add(person);
                line = bufferedReader.readLine();
            }
            print();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return people;
    }

    //print method
    public void print() {

//        String[] list = {"Winner", "Runner-up", "Third Place"};

        //number of participants
        String[] list = new String[10];
        list[0]="Winner - ";
        list[1]="Runner-up - ";
        list[2]="Third Place - ";
        list[3]="";

        for (int i = 0; i < 1; i++) {
            for (People e : people) {
                System.out.println(list[i]  + e);
                i++;
            }
        }
    }

    @Override
    public int compareTo(PeopleCSVReader o) {
        return 0;
    }
}