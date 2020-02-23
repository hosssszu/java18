package homework04.hashMap;

/**
 * You need to store some information about some persons: for one person, you need a list of his/her hobbies;
 * You will use a HashMap<Persoana, List<Hobby>>
 *
 * @author Loránd
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Person p = new Person("Ana");
        Person p1 = new Person("Anca");
        Hobby h1 = new Hobby("cycle");
        Hobby h2 = new Hobby("swim");
        Hobby h3 = new Hobby("run");
        Hobby h4 = new Hobby("gaming");

        //create list of hobby
        List<Hobby> hl1 = new ArrayList<>();
        hl1.add(h1);
        hl1.add(h2);

        //create list of hobby
        List<Hobby> hl2 = new ArrayList<>();
        hl2.add(h3);
        hl2.add(h4);

        //create hashmap
        Map<Person, List<Hobby>> list = new HashMap<>();
        list.put(p, hl2);
        list.put(p1, hl1);

        System.out.println(list);
        
    }
}
