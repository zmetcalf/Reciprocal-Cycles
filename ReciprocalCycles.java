import java.util.Arrays;
import java.math.BigDecimal;

public class ReciprocalCycles {

	private int recipAmount;
    private int precision = 10000;
    	
	private BigDecimal testDeci;
	private BigDecimal highestDeci = new BigDecimal(0.0);
	private BigDecimal denominator = new BigDecimal(2.0);
	
	private static final BigDecimal NUMERATOR = new BigDecimal(1.0);	
	private static final BigDecimal UPTO = new BigDecimal(1000.0);
	private static final BigDecimal COUNTER = new BigDecimal(1.0);
	
	public ReciprocalCycles() {
		while(denominator.compareTo(UPTO) == -1) {
		    try {
		        testDeci = NUMERATOR.divide(denominator, BigDecimal.ROUND_UNNECESSARY);
		    }
		    catch(ArithmeticException e) {
		        testDeci = NUMERATOR.divide(denominator, precision, BigDecimal.ROUND_UP);
		        recipAmount = findReciprocal(testDeci);
		    
		        if(BigDecimal.valueOf(recipAmount).compareTo(highestDeci) == 1) {
		            highestDeci = denominator;
		        }
		    }
		    denominator = denominator.add(COUNTER);
		}
		System.out.println(highestDeci);
	}
	
	private int findReciprocal(BigDecimal test) {
	    
	    char[] characterArray;
		char[] testArray1;
		char[] testArray2;
	    int counter = 1;
		int endNumber = 0;
		int simpleIt = 0;
	    
	    characterArray = (test.toString()).toCharArray();

        if(characterArray[2] == characterArray[3] && 
				characterArray[7] == characterArray[26] &&
				characterArray[2] == characterArray[1231]) {
            return 1;
        }

		while(counter < (precision / 2)) {
			for(int i =  counter; i < ((precision / 2) - counter - 5); i++) {
				testArray1 = Arrays.copyOfRange(characterArray, counter + 2, counter + 2 + i);
				testArray2 = Arrays.copyOfRange(characterArray, counter + 3 + i, counter + 3 + i + i);
				if(Arrays.equals(testArray1, testArray2)) {
					if(Arrays.equals(testArray1, Arrays.copyOfRange(characterArray, counter + 4 + i + i, counter + 22 + i + i + i)));
						return (i + 1);
				}
			}
			counter++;
		}
	    return 0 ;
	}
}
