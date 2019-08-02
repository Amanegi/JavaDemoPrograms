package pattern;

import java.util.Scanner;

public class Starout{

	public static void main(String[] args) {
		int rows, space, pat, num, n, a;

		System.out.println("Enter the number of rows : ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		scan.close();
		n = num;
		a = num;

		for (rows = 1; rows <= num - 1; rows++) {

			for (space = 1; space <= n; space++) {
				System.out.print("*");
			}
			for (pat = 1; pat <= rows-1; pat++) {
				System.out.print("  ");
			}
			for (space = 1; space <= n; space++) {
				System.out.print("*");
			}
			n--;
			System.out.print("\n");

		}

		for (rows = 1; rows <= num; rows++) {

			for (pat = 1; pat <= rows; pat++) {
				System.out.print("*");
			}
			for (space = 1; space <= a-1; space++) {
				System.out.print("  ");
			}
			for (pat = 1; pat <= rows; pat++) {
				System.out.print("*");
			}
			a--;
			System.out.print("\n");

		}

	}

}
