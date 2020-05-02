package homework08.calculator;

/**
 * Basic calculator.
 *
 * @author Loránd
 */
public class Calculator {
    public static void main(String[] args) {
        CalculatorOp calculator = new CalculatorOp();
        calculator.operation((double) 3, "*", (double) 2);
    }
}