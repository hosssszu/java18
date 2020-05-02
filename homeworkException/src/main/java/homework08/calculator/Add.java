package homework08.calculator;

public class Add implements IOperation<Double> {

    @Override
    public <N extends Number> double operation(N a, N b) {
        double sum = a.doubleValue() + b.doubleValue();
        return sum;
    }
}