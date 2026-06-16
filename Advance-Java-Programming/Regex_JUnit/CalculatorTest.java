import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }
}

public class CalculatorTest {

    @Test
    void testAddition() {

        Calculator calc =
                new Calculator();

        assertEquals(
                20,
                calc.add(10,10));
    }
}