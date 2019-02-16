import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcularorTest {
    @Test
    public void calculatorTest() {
        int a = 10;
        int b = 11;
        String option = "+";
        MyCalculator calculator = new MyCalculator();
        int expectedResult = 21;
        int result = calculator.calculate(a, b, option);
        assertEquals(expectedResult, result);
    }

    @Test
    public void calculatorTest2() {
        int a = 10;
        int b = 0;
        String option = "/";
        MyCalculator calculator = new MyCalculator();
        int expectedResult = 0;
        int result = calculator.calculate(a, b, option);
        assertEquals(expectedResult, result);
    }
}
