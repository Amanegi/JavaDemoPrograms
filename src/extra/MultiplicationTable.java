package extra;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		System.out.println("Enter a number for multipliaction table : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("Enter the number upto which table will be printed : ");
		int t = sc.nextInt();
		sc.close();

		for (int i = 1; i <= t; i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
		}

	}

}
