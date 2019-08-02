package exception;

import java.util.Scanner;

public class TryCatchDemo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int x, y, z;

		System.out.print("Enter first number : ");
		x = s.nextInt();
		System.out.print("Enter first number : ");
		y = s.nextInt();

		try { // Tries to run the code where exception is present
			z = x / y;
			System.out.println("Division = " + z);
		} catch (Exception e) { // Catches the exception thrown by try
			System.out.println(e);
		}

		finally { // Executed independent of the exception
			s.close();
		}

	}

}
