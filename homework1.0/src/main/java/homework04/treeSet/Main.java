package homework04.treeSet;

/**
 * You need to store Persoane in a TreeSet.
 * Define 2 Comparators (one for name and one for age) that will be used when creating the TreeSet;
 * Add Persoane to the TreeSet; iterate throug the treeset and print the name and the age;
 *
 * @author Loránd
 */

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ordonare dupa nume");

        //add persons in the TreeSet
        Set<Persoana> p1 = new TreeSet<Persoana>(new Nume());
        p1.add(new Persoana("Ana", 18));
        p1.add(new Persoana("Ana", 20));
        p1.add(new Persoana("Mihai", 19));
        p1.add(new Persoana("Radu", 17));
        p1.add(new Persoana("Ion", 16));
        for (Persoana e : p1) {
            System.out.println(e);
        }

        System.out.println("\nOrdonare dupa varsta");
        //add persons in the TreeSet
        Set<Persoana> p2 = new TreeSet<Persoana>(new Varsta());
        p2.add(new Persoana("Ana", 18));
        p2.add(new Persoana("Mihai", 19));
        p2.add(new Persoana("Radu", 17));
        p2.add(new Persoana("Ion", 16));
        for (Persoana e : p2) {
            System.out.println(e);
        }
    }
}
