package extra;

import java.util.Scanner;

public class ReverseOfDigitsOFNumber {

	public static void main(String[] args) {

		int num, a, b, d = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		a = sc.nextInt();
		num = a;
		sc.close();

		while (a > 0) {
			b = a % 10;
			a = a / 10;
			d = (d * 10) + b;
		}

		System.out.println("Reverse of " + num + " is : " + d);

	}

}
