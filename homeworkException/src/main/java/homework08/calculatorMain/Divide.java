package homework08.calculatorMain;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
// this class is for to divide two number
public class Divide implements Operation {
    Scanner scanner = new Scanner(System.in);
    @Override
    public double element(double element) {
        String varDivide = scanner.nextLine();
        double varDivideDouble;

        if (varDivide.equals("(")) {
            double parenthese = new Parenthese().useParenthese();
            return element / parenthese;
        } else if (varDivide.equals("0")) {
            varDivideDouble = getZero(varDivide);
            return varDivideDouble;
        } else {
            try {
                varDivideDouble = Double.parseDouble(varDivide);
            } catch (NumberFormatException e) {
                log.error("You should type a number");
                while (!scanner.hasNextDouble()) {
                    scanner.next();
                    log.error("You should type a number");
                }
                varDivideDouble = scanner.nextDouble();
            }
            return element / varDivideDouble;
        }
    }

    // in case we introduce 0 to give use an exception
    public double getZero(String zero) throws UncheckedException {
        double inputZero;
        inputZero = Double.parseDouble(zero);
        if (inputZero == 0) {
            log.info("You can't divide a number with 0");
            throw new UncheckedException("/ by zero");
        }
        return 0;
    }
}