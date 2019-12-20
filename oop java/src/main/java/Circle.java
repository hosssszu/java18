public class Circle {
    public static final double PI = 3.14;
    double raza;
    String color;

    public Circle(double raza, String color) {
        this.raza = raza;
        this.color = color;
    }

    public double getRaza() {
        return PI * raza * raza;
    }

    public double getPerimetru() {
        return 2 * PI * raza;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "raza=" + raza +
                ", color='" + color + '\'' +
                '}';
    }

    //    @Override
//    public String toString() {
//        return "Circle with r: " + this.raza + " and c: " + this.color;
//    }

}