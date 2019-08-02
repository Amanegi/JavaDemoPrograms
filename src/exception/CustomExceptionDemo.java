package exception;

public class CustomExceptionDemo {

	public static void main(String[] args) {

		Circle c;
		try {
			c = new Circle(-5);
			c.area();
		} catch (InvalidRadiusException e) {
			System.out.println(e);
		}
		
	}

}

@SuppressWarnings("serial")
class InvalidRadiusException extends Exception {
	public InvalidRadiusException() {
		super();
	}

	public InvalidRadiusException(String message) {
		super(message);
	}
}

class Circle {
	double r;

	public Circle(double r) throws InvalidRadiusException {
		if (r < 0) {
			throw new InvalidRadiusException("Radius cannot be negative");
		} else {
			this.r = r;
		}
	}

	void area() {
		System.out.println("Area = " + (Math.PI * r * r));
	}
}
