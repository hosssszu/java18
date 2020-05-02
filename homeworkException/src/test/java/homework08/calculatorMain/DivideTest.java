package homework08.calculatorMain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DivideTest {

    Divide divide = new Divide();

    @Test
    void getZero() {
        Assertions.assertThrows(UncheckedException.class, () -> {
            divide.getZero("0");
        });
    }
}