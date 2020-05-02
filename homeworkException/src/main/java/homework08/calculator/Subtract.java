package homework08.calculator;

public class Subtract implements IOperation<Double> {

    @Override
    public <N extends Number> double operation(N a, N b) {
        double sum = a.doubleValue() - b.doubleValue();
        return sum;
    }
}