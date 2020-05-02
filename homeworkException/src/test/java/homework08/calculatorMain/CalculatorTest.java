package homework08.calculatorMain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testExpectedException() {
        Assertions.assertThrows(CheckedException.class, () -> {
            calculator.parseInit("22o");
        });
    }
}