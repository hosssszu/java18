package homework05;

import java.util.Comparator;

public class Comp implements Comparator<People> {

    @Override
    public int compare(People o1, People o2) {

        if(o1.second() > o2.second()){
             return 1;
        } else {
             return -1;
        }
    }
}
