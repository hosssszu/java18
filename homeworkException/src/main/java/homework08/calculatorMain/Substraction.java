package homework08.calculatorMain;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
// this class is for to substract two number
public class Substraction implements Operation {
    Scanner scanner = new Scanner(System.in);
    @Override
    public double element(double element){
        String varSubstraction = scanner.nextLine();
        double varSubstractionDouble;

        if (varSubstraction.equals("(")) {
            double parenthese = new Parenthese().useParenthese();
            return element - parenthese;
        } else {
            try {
                varSubstractionDouble = Double.parseDouble(varSubstraction);
            } catch (NumberFormatException e) {
                log.error("You should type a number");
                while (!scanner.hasNextDouble()) {
                    scanner.next();
                    log.error("You should type a number");
                }
                varSubstractionDouble = scanner.nextDouble();
            }
            return element - varSubstractionDouble;
        }
    }
}