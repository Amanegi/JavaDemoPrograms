package extra;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		
		System.out.println("Enter the last number natural number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i = 1; i<=n;i++){
			System.out.println(i);
		}

	}

}
