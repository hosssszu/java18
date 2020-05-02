package homework08.calculatorMain;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
public class Calculator {
//    final Logger logger = LogManager.getLogger(Calculator.class.getName());
    double total = 0;
    double init;

    public void calc() {

        log.info("You should type something like this: 3*(2+5)= ");
        log.info("After every input you need to press the 'Return' button");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        try {
            init = parseInit(a);
        } catch (CheckedException e) {
            log.error("Status code: " + e.getCode() + ", Error message: " + e.getMessage());
            while (!scanner.hasNextDouble()) {
                scanner.next();
                log.error("Status code: " + e.getCode() + ", Error message: " + e.getMessage());
            }
            init = scanner.nextDouble();
        }
        total = total + init;
        total = getOperator(scanner, total);
        log.info("Total is: " + total);
    }

    // this method is to parse a number and in case we introduce a string to give a checked exception
    public double parseInit(String init) throws CheckedException {
        double value;
        try {
            value = Double.parseDouble(init);
        } catch (NumberFormatException e) {
            throw new CheckedException(8000, "should be a number.");
        }
        return value;
    }

    // this method is to select and execute the selected operation
    public double getOperator(Scanner scanner, double total) {
        String var;
        String reset;
        label:
        while (scanner.hasNext()) {
            var = scanner.nextLine();
            switch (var) {
                case "=":
                case ")":
                    break label;
                case "":
                    break;
                case "r":
                    reset = scanner.nextLine();
                    total = Double.parseDouble(reset);
                    break;
                case "+":
                    total = new Addition().element(total);
                    break;
                case "-":
                    total = new Substraction().element(total);
                    break;
                case "*":
                    total = new Multiply().element(total);
                    break;
                case "/":
                    total = new Divide().element(total);
                    break;
                case "%":
                    total = new Modulus().element(total);
                    break;
                default:
                    log.info("Add one of these operations: '+', '-', '*', '/', '%', '=', 'r'(reset)");
            }
        }
        return total;
    }
}
