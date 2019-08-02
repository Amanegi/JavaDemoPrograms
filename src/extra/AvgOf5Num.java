package extra;

import java.util.Scanner;

public class AvgOf5Num {

	public static void main(String[] args) {

		System.out.println("Enter the 5 numbers to find average : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		sc.close();

		System.out.println("Average will be : ");
		System.out.print("(" + a + "+" + b + "+" + c + "+" + d + "+" + e + ")/5");
		System.out.print("\t= " + (a + b + c + d + e) / 5);

	}

}
