import java.util.HashMap;

public class Polynomial {
    private HashMap<Integer, Integer> ExponentAndCoefficientMap;
    private int x;
    private int polynomialValue;

    public Polynomial(HashMap<Integer, Integer> polynomial, int x) {
        this.ExponentAndCoefficientMap = polynomial;
        this.x = x;
    }

    public int computePolynomialValue() {

        for (Integer exponent : ExponentAndCoefficientMap.keySet()) {
            polynomialValue += (int) (ExponentAndCoefficientMap.get(exponent) * Math.pow(x, exponent));
        }

        return polynomialValue;
    }
}