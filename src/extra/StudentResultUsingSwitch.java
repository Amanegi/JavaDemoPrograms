package extra;

import java.util.Scanner;

public class StudentResultUsingSwitch {

	public static void main(String[] args) {

		System.out.print("Enter the marks of student : ");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		sc.close();

		switch (marks) {
		case 100:
		case 99:
		case 98:
		case 97:
		case 96:
		case 95:
		case 94:
		case 93:
		case 92:
		case 91:
			System.out.println("A+ Grade");
			break;
		case 90:
		case 89:
		case 88:
		case 87:
		case 86:
		case 85:
		case 84:
		case 83:
		case 82:
		case 81:
			System.out.println("A Grade");
			break;
		case 80:
		case 79:
		case 78:
		case 77:
		case 76:
		case 75:
		case 74:
		case 73:
		case 72:
		case 71:
			System.out.println("B+ Grade");
			break;
		case 70:
		case 69:
		case 68:
		case 67:
		case 66:
		case 65:
		case 64:
		case 63:
		case 62:
		case 61:
			System.out.println("B Grade");
			break;
		case 60:
		case 59:
		case 58:
		case 57:
		case 56:
		case 55:
		case 54:
		case 53:
		case 52:
		case 51:
			System.out.println("C Grade");
			break;
		case 50:
		case 49:
		case 48:
		case 47:
		case 46:
		case 45:
			System.out.println("Just Pass");
			break;
		default:
			System.out.println("Fail");
			break;

		}

	}

}
