package extra;

public class SeriesUsingLeftShiftOperator {

	public static void main(String[] args) {
		int n, x, i = 1;
		n = i << 1;
		System.out.println(i);
		System.out.println(n);

		for (x=3; x <= 20;x++) {
			n = n<<1;
			System.out.println(n);
		}
	}

}
