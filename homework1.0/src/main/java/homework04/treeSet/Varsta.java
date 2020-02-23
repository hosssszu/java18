package homework04.treeSet;

import java.util.Comparator;

public class Varsta implements Comparator<Persoana> {
    public int compare(Persoana e1, Persoana e2) {
        if(e1.getVarsta() > e2.getVarsta()){
            return 1;
        } else {
            return -1;
        }
    }
}
