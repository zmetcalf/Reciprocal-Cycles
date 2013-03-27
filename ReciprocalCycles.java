import java.util.Arrays;
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
		    System.out.println(findReciprocal(testDeci));
		}
	}
	
	private int findReciprocal(BigDecimal test) {
	    
	    char[] characterArray;
		char[] testArray1;
		char[] testArray2;
	    int counter = 0;
		int endNumber = 0;
	    
	    characterArray = (test.toString()).toCharArray();

		while(counter < 5000) {
			for(int i =  counter; i < (5000 - counter); i++) {
				testArray1 = Arrays.copyOfRange(characterArray, counter + 2, counter + 2 + i);
				testArray2 = Arrays.copyOfRange(characterArray, counter + 3 + i, counter + 3 + i + i);
				System.out.println(testArray1);
				System.out.println(testArray2);
				if(Arrays.equals(testArray1, testArray2)) {
					return (i + 1);
				}
			}
			counter++;
		}
	    return 0 ;
	}
}
