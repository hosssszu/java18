public class CircleTest {
    public static void main(String[] args) {
        Circle C1 = new Circle(5, "red");
        System.out.println("Aria obiectului C1 este: " + C1.getRaza());
        System.out.println("Perimetrul C1 este: " + C1.getPerimetru());
        System.out.println("Culoarea obiectului C1 este: " + C1.color);
        Circle C2 = new Circle(6, "green");
        System.out.println("Aria obiectului C1 este: " + C2.getRaza());
        System.out.println("Perimetrul C1 este: " + C2.getPerimetru());
        System.out.println("Culoarea obiectului C1 este: " + C2.color);
        Circle C3 = new Circle(8, "black");
        System.out.println("Aria obiectului C1 este: " + C3.getRaza());
        System.out.println("Perimetrul C1 este: " + C3.getPerimetru());
        System.out.println("Culoarea obiectului C1 este: " + C3.color);

        Circle C4 = new Circle(10, "Pink");
        System.out.println("Apelarea metode din object class");
        System.out.println(C4.toString());

        createArrayOfCircle();
    }


    public static void createArrayOfCircle() {
        Circle[] array = new Circle[10];
        for (int i = 0; i <= array.length - 1; i++) {
            if (i % 2 == 0) {
                Circle circleEven = new Circle(i + 1, "blue");
                array[i] = circleEven;
                System.out.println(array[i]);
            } else {
                Circle circleOdd = new Circle(i + 1, "red");
                array[i] = circleOdd;
                System.out.println(array[i]);
            }
        }
        for (Circle itemCircle : array) {
            System.out.println(itemCircle.color);
        }
    }
}