package array;

public class MatrixMultiply {

	public static void main(String[] args) {
		int[][] arr1 = new int[2][2];
		int[][] arr2 = new int[2][2];
		insert(arr1);
		System.out.println("Array 1 is---------");
		display(arr1);
		insert(arr2);
		System.out.println("Array 2 is---------");
		display(arr2);
		System.out.println("Product is---------");
		int[][] pro = multiply(arr1, arr2);
		display(pro);
	}

	static int[][] insert(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 10);
			}
		}
		return a;
	}

	static int[][] display(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		return a;
	}

	static int[][] multiply(int[][] a, int[][] b) {
		int[][] product = new int[a.length][b[0].length];
		for (int i = 0; i < a[0].length; i++) {
			for (int j = 0; j < b.length; j++) {
				for (int k = 0; k < b.length; k++) {
					product[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return product;
	}
}
