package pattern;

import java.util.Scanner;

public class ABCdiamond {
	//To print Alphabets
	// System.out.print((char) (65+n));
	public static void main(String[] args) {
		int rows, space, alpf, alpr, num, n, p;

		System.out.println("Enter the number of rows upto 26 : ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		scan.close();
		n = num;
		p = num;

		for (rows = 1; rows <= num-1; rows++) {
			int j = rows - 1;
			for (space = 1; space <= n; space++) {
				System.out.print(" ");
			}
			n--;
			for (alpf = 1; alpf <= rows; alpf++) {
				System.out.print((char) (64 + alpf));
			}
			for (alpr = 1; alpr <= rows - 1; alpr++) {
				System.out.print((char) (64 + j));
				j--;
			}
			System.out.println();
		}

		for (rows = 1; rows <= num; rows++) {
			int k = num-rows;
			for (space = 1; space <= rows; space++) {
				System.out.print(" ");
			}
			for (alpf = 1; alpf <= p; alpf++) {
				System.out.print((char) (64 + alpf));
			}
			for(alpr=1;alpr<=p-1;alpr++){
				System.out.print((char)(64+k));
				k--;
			}
			p--;
			System.out.println();
		}
	}

}
