package ternaryoperator;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int max = 0;

		max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

		System.out.println("The greatest number is " + max);

	}

}
