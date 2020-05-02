package homework08.calculatorMain;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
public class Modulus implements Operation {
    Scanner scanner = new Scanner(System.in);
    @Override
    public double element(double element) {
        String varModulus = scanner.nextLine();
        double varModulusDouble;

        if (varModulus.equals("(")) {
            double parenthese = new Parenthese().useParenthese();
            return element % parenthese;
        } else if (varModulus.equals("0")) {
            varModulusDouble = getZero(varModulus);
            return varModulusDouble;
        } else {
            try {
                varModulusDouble = Double.parseDouble(varModulus);
            } catch (NumberFormatException e) {
                log.error("You should type a number");
                while (!scanner.hasNextDouble()) {
                    scanner.next();
                    log.error("You should type a number");
                }
                varModulusDouble = scanner.nextDouble();
            }
            return element % varModulusDouble;
        }
    }

    // in case we introduce 0 to give use an exception
    public double getZero(String zero) throws UncheckedException {
        double inputZero;
        inputZero = Double.parseDouble(zero);
        if (inputZero == 0) {
            log.info("You can't use modulus with 0");
            throw new UncheckedException("/ by zero");
        }
        return 0;
    }
}