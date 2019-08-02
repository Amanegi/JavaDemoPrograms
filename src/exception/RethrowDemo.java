package exception;

public class RethrowDemo {

	public static void main(String[] args) {

		try{
			divide();
		}catch(Exception e){
			System.out.println(e);
			System.out.println("In Main method");
		}
	}

	public static void divide() {
		int x = 10, y = 0, z;
		try{
		z = x / y;
		System.out.println(z);
		}catch(Exception e){
			System.out.println(e);
			System.out.println("In Divide method");
			throw e;
		}
	}

}
