package homework04.treeSet;

import java.util.Comparator;

public class Nume implements Comparator<Persoana> {

    public int compare(Persoana e1, Persoana e2) {
        return e1.getNume().compareTo(e2.getNume());
    }



}
