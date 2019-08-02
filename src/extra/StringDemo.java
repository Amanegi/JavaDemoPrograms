package extra;

public class StringDemo {

	public static void main(String[] args) {

		// String practice
		String myStr = "Hello World !";
		System.out.println("Length of string is " + myStr.length());
		System.out.println("String in lower case : " + myStr.toLowerCase());
		System.out.println("String in upper case : " + myStr.toUpperCase());
		System.out.println("Replacing a letter l to d : " + myStr.replace('l', 'd'));
		System.out.println("To find index : " + myStr.indexOf('o'));
		System.out.println("Remove white spcaes : " + myStr.trim());
		System.out.println("CharAt 7 : "+ myStr.charAt(7));
		
		String myStr1 = "Hello";
		String myStr2 = " Java";
		System.out.println(myStr1.concat(myStr2));
		System.out.println(myStr1.compareTo(myStr2));
		System.out.println(myStr1.endsWith("o"));

	}

}
