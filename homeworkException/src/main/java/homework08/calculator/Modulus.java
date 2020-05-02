package homework08.calculator;

public class Modulus implements IOperation<Double> {

    @Override
    public <N extends Number> double operation(N a, N b) {
        double f = a.doubleValue();
        double s = b.doubleValue();
        if (s == 0) {
            System.out.println("Error! Dividing by zero is not allowed.");
            return 0;
        } else {
            return f % s;
        }
    }
}