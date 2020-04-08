package homework06;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    public int compare(Car e1, Car e2) {
        return e1.getModel().compareTo(e2.getModel());
    }
}
