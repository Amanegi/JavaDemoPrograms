package overloading;

public class OverloadingDemo {

	public static void main(String[] args) {

		Sum sum = new Sum();

		int a = sum.sum(10, 20);
		System.out.println(a);

		double b = sum.sum(10.2, 20.3);
		System.out.println(b);

		int c = sum.sum(10, 20, 30);
		System.out.println(c);

	}

}
