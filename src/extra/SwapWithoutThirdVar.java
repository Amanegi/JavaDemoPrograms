package extra;

import java.util.Scanner;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int x = sc.nextInt();
		System.out.print("Enter Second Number : ");
		int y = sc.nextInt();
		sc.close();

		System.out.println("Before Swapping\tI\t= " + x);
		System.out.println("Before Swapping\tII\t= " + y);

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println();
		System.out.println("After Swapping\tI\t= " + x);
		System.out.println("After Swapping\tII\t= " + y);

	}

}
