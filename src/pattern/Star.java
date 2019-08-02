package pattern;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {

		int rows, space, pat, num, n, a;

		System.out.println("Enter the number of rows : ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		scan.close();
		n = num;
		a = num;

		for (rows = 1; rows <= num-1; rows++) {

			for (space = 1; space <= n; space++) {
				System.out.print(" ");
			}
			n--;
			for (pat = 1; pat <= rows; pat++) {
				System.out.print("* ");
			}
			System.out.print("\n");

		}

		for (rows = 1; rows <= num; rows++) {

			for (pat = 1; pat <= rows; pat++) {
				System.out.print(" ");
			}
			for (space = 1; space <= a; space++) {
				System.out.print("* ");
			}
			a--;
			
			System.out.print("\n");

		}

	}

}
