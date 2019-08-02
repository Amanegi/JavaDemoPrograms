package check;

import java.util.Scanner;

public class VowelCheck {

	public static void main(String[] args) {

		char alp;
		System.out.print("Enter an alphabet : ");
		Scanner sc = new Scanner(System.in);
		alp = sc.next().charAt(0);

		if (alp == 'a' | alp == 'e' | alp == 'i' | alp == 'o' | alp == 'u') {
			System.out.println(alp + " is a vowel");
		} else {
			System.out.println(alp + " is a not vowel");
		}
		sc.close();
	}

}
