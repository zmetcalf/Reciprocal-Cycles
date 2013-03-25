import java.math.BigDecimal;

public class ReciprocalCycles {

	private BigDecimal testDeci;
	private BigDecimal numerator = new BigDecimal(1.0);
	private BigDecimal denominator = new BigDecimal(7.0);

	public ReciprocalCycles() {
		try {
		    testDeci = numerator.divide(denominator, BigDecimal.ROUND_UNNECESSARY);
		}
		catch(ArithmeticException e) {
		    testDeci = numerator.divide(denominator, 10000, BigDecimal.ROUND_DOWN);
		    findReciprocal(testDeci);
		}
	}
	
	private int findReciprocal(BigDecimal test) {
	    
	    char[] characterArray;
	    int reciprocal = 0;
	    int counter = 2;
	    
	    characterArray = (test.toString()).toCharArray();

	    return reciprocal;
	}
}
