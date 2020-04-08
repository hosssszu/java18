package homework06;

/**
 * @author Loránd
 */

public class Java8Main {
    public static void main(String[] args) {

        CarMain carMain = new CarMain();
        Car car = new Car("Ford",7,"red");
        carMain.addData();  // 1.
        carMain.getCars();  // 2.
        carMain.min();  // 3.
        carMain.order(carMain.getCars());    // 8.
        carMain.match();    // 9.
        carMain.optional(car);  // 10/

        StringGenerator stringGenerator = new StringGenerator();
        stringGenerator.createSet();    // 4.
        stringGenerator.reverseOrder(); // 7.
        stringGenerator.shortestString();   // 11.

        Number number = new Number();
        number.random();    // 5.
        number.map();   // 6.

    }
}
