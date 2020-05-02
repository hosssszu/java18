package homework08.calculatorMain;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
// this method is used in case we use parenthese
public class Parenthese {
    Scanner scanner = new Scanner(System.in);
    public double useParenthese() {
        double totalParenthese = 0;
        boolean conditionIf = false;
        boolean conditionWhile = true;

        while (conditionWhile) {

            if (conditionIf) {
                break;
            } else {
                try {
                    String line = scanner.nextLine();
                    totalParenthese = totalParenthese + Double.parseDouble(line);
                } catch (Exception e) {
                    log.info("You need to input a number.");
                    while (!scanner.hasNextDouble()) {
                        scanner.next();
                        log.info("You need to input a number.");
                    }
                    double test = scanner.nextDouble();
                    totalParenthese = totalParenthese + test;
                }
                totalParenthese = new Calculator().getOperator(scanner, totalParenthese);
            }
            conditionIf = true;
            conditionWhile = false;
        }
        log.debug("The value from parenthese is: " + totalParenthese);
        return totalParenthese;
    }
}