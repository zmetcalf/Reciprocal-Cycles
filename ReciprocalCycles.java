import java.math.BigDecimal;

public class ReciprocalCycles {

	private BigDecimal testDeci;
	private BigDecimal numerator = new BigDecimal(1.0);
	private BigDecimal denominator = new BigDecimal(7.0);

	public ReciprocalCycles() {
		testDeci = numerator.divide(denominator, 1000, BigDecimal.ROUND_FLOOR);
		System.out.println(testDeci);
	}
}
