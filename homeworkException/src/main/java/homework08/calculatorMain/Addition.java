package homework08.calculatorMain;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
// this class is for to add two number
public class Addition implements Operation {
    Scanner scanner = new Scanner(System.in);
    @Override
    public double element(double element) {
        String varAddition = scanner.nextLine();
        double varAddDouble;

        if (varAddition.equals("(")) {
            double parenthese = new Parenthese().useParenthese();
            return element + parenthese;
        } else {
            try {
                varAddDouble = Double.parseDouble(varAddition);
            } catch (NumberFormatException e) {
                log.error("You should type a number");
                while (!scanner.hasNextDouble()) {
                    scanner.next();
                    log.error("You should type a number");
                }
                varAddDouble = scanner.nextDouble();
            }
            return element + varAddDouble;
        }
    }
}
