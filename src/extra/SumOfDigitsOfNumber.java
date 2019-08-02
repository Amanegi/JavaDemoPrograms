package extra;

import java.util.Scanner;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		int num = a;
		int sum = 0;
		sc.close();

		// a % 10 != 0
		while (a > 0) {
			sum = sum + (a % 10);
			a = a / 10;
		}

		System.out.println("The sum of digits of " + num + " is : " + sum);

	}

}
