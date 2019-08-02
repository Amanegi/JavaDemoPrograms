package array;

import java.util.Scanner;

public class Array2d {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		insertrandom(arr);
		display(arr);
		System.out.println("Array elements are : ");
		// display(arr);
		// System.out.println("Transpose of array is : ");
		display(transpose(arr));
		rowsum(arr);
	}

	static int[][] transpose(int[][] a) {
		int[][] t = new int[a[0].length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				t[j][i] = a[i][j];
			}
		}
		return t;
	}

	static void insertrandom(int[][] a) {
		System.out.println("The elements of array are : ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 10);
			}
		}
	}

	static void insert(int[][] a) {
		System.out.println("Enter the elements of array : ");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		sc.close();
	}

	static void display(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

	static void rowsum(int[][] a) {
		int sum;
		System.out.println("The row sum is :");
		for (int i = 0; i < a.length; i++) {
			sum = 0;
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
				sum = a[i][j] + sum;
			}
			System.out.print("Sum = " + sum);
			System.out.println();
		}
	}

}