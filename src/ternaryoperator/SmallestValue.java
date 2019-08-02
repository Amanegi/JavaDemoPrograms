package ternaryoperator;

import java.util.Scanner;

public class SmallestValue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 different numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int min = 0;

		min = (a < b) ? (a < c ? a : c) : (b < c ? b : c);

		System.out.println("The smallest number is " + min);

	}

}
