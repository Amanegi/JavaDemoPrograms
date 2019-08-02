package check;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		// Check a number is even or odd
		System.out.println("Enter a whole number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.println(n + " is even");
		} else {
			System.out.println(n + " is odd");
		}
		sc.close();
	}

}
