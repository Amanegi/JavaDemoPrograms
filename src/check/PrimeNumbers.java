package check;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		int i, p = 0;
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (i = 2; i <= num - 1; i++) {
			if (num % i == 0) {
				p = 1;
				break;
			}
		}
		sc.close();
		if (num == 1) {
			System.out.println("1 is neither prime nor composite");
		} else if (p == 0) {
			System.out.println(num + " is prime");
		} else {
			System.out.println(num + " is not prime");
		}
	}

}
