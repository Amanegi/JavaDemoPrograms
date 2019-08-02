package extra;

import java.util.Scanner;

public class SumOfnNum {

	public static void main(String[] args) {
		long num, i, sum = 0;
		System.out.println("Enter the number upto which sum required: ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		scan.close();

		for (i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

	}

}
