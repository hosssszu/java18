package homework08.calculatorMain;

/**
 * Create a generic Calculator using the proper placeholder.
 * Do any operation +, -, *, /, reset, parentheses, %.
 *
 * @author Loránd
 *
 * What both calculators have in common?
 * Both calculators need to do the same operations. Usually every operation have two numbers and an operator.
 *
 * Do we need an interface?
 * If we make an interface we make sure to import some characteristics which have the operations.
 *
 */

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calc();
    }
}