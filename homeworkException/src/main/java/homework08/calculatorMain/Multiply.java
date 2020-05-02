package homework08.calculatorMain;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
// this class is for to multiply two number
public class Multiply implements Operation {
    Scanner scanner = new Scanner(System.in);
    @Override
    public double element(double element) {
        String varMultiply = scanner.nextLine();
        double varMultiplyDouble;

        if (varMultiply.equals("(")) {
            double parenthese = new Parenthese().useParenthese();
            return element * parenthese;
        } else {
            try {
                varMultiplyDouble = Double.parseDouble(varMultiply);
            } catch (NumberFormatException e) {
                log.error("You should type a number");
                while (!scanner.hasNextDouble()) {
                    scanner.next();
                    log.error("You should type a number");
                }
                varMultiplyDouble = scanner.nextDouble();
            }
            return element * varMultiplyDouble;
        }
    }
}