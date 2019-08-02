package exception;

public class MultipleException {

	public static void main(String[] args) {

		int[] num = { 10, 20, 30, 40, 50 };
		int[] den = { 1, 0, 2, 3 };

		for (int i = 0; i < num.length; i++) {
			try {
				System.out.println(num[i] + " / " + den[i] + " = " + num[i] / den[i]);
			}catch(ArithmeticException e){
				System.out.println(e);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			} catch (Exception e) { // Subclass comes first then comes parent
									// class of exception
				System.out.println(e);
			}
		}

	}

}