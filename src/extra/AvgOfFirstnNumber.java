package extra;

import java.util.Scanner;

public class AvgOfFirstnNumber {

	public static void main(String[] args) {

		long num, sum = 0;
		System.out.println("Enter the number upto which sum required: ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		scan.close();

		System.out.print("(");
		for (int n = 1; n <= num; n++) {
			sum = sum + n;
			if (n < num) {
				System.out.print(n);
				System.out.print("+");
			} else {
				break;
			}
		}
		System.out.print(num+")"+"/"+num);
		System.out.println();
		System.out.print("= "+sum);
	}

}
