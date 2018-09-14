import org.junit.Before;

import java.util.HashMap;

import static org.junit.Assert.*;

public class PolynomialTest {
    private Polynomial polynomial;
    private HashMap<Integer, Integer> ExponentAndCoefficientMap;

    @Before
    public void setUp() throws Exception {
        ExponentAndCoefficientMap = new HashMap<>();

        ExponentAndCoefficientMap.put(3, 2);
        ExponentAndCoefficientMap.put(2, -6);
        ExponentAndCoefficientMap.put(1, 2);
        ExponentAndCoefficientMap.put(0, -1);

        polynomial = new Polynomial(ExponentAndCoefficientMap, 3);
    }

    @org.junit.Test
    public void shouldComputePolynomialValueUsingInputStringAndValueOfXWhenComputePolynomialIsInvoked() throws Exception {
        assertEquals(5, polynomial.computePolynomialValue());
    }
}