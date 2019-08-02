package exception;

import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) {
		
		try {
			boolean res = guess();
			if(res){
				System.out.println("Correct");
			}else{
				System.out.println("Incorrect");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static boolean guess() throws IOException {
		char ch = 'a';
		System.out.println("Enter A in small letter");
		char x = (char) System.in.read();
		return (x == ch);

	}

}
