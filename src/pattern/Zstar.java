package pattern;

import java.util.Scanner;

public class Zstar {

	public static void main(String[] args) {

		int rows, num, n, i;

		System.out.print("Enter the number of rows :  ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		n = num;

		// Loop for first row of star
		for (i = 1; i <= num; i++) {
			System.out.print("* ");
		}
		System.out.println();

		// Loop for diagonal
		for (rows = 2; rows <= num - 1; rows++) {
			for(i=1;i<=n-rows;i++){
				System.out.print("  ");
			}
			System.out.println("* ");
		}

		// Loop for last row of star
		for (i = 1; i <= num; i++) {
			System.out.print("* ");
		}

	}

}
