package array;

import java.util.Scanner;

public class Array1d {

	public static void main(String[] args) {

		int[] arr = new int[5];
		insert(arr);
		display(arr);
		display(reverse(arr));
		display(arr);
	}

	static int[] reverse(int[] a) {
		int[] temp = new int[a.length];
		System.out.println("Reverse of array is : ");
		int j = 0;
		for (int i = a.length - 1; i >= 0; i--, j++) {
			temp[j] = a[i];
		}
		return temp;
	}

	static void insert(int[] a) {
		System.out.println("Enter the elements of array : ");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
	}

	static void display(int[] a) {
		System.out.println("Array elements are : ");
		for (int j : a) {
			System.out.println(j);
		}
	}

}
