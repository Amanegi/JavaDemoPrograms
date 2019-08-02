package exception;

public class ThrowDemo {

	public static void main(String[] args) {
		double x, y;
		x = 10.5;
		y = 0.0;
		try {
			System.out.println(divide(x, y));
		} catch (Exception e) {
			System.out.println(e);
		} 
	}

	//This is done because in double when den is 0 no error is shown by compiler
	public static double divide(double num, double den) {
		if (den == 0) {
			throw new ArithmeticException("Denominator is \"ZERO\"");
		} else {
			return num / den;
		}
	}

}
