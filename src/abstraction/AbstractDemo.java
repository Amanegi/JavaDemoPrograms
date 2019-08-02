package abstraction;

abstract class Shapee {
	abstract void area();

	abstract void perimeter();
}

class Rectanglee extends Shapee {

	private int length, breadth;

	public Rectanglee(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	void area() {
		System.out.println("Area = " + (length * breadth));
	}

	@Override
	void perimeter() {
		System.out.println("Perimeter = " + (2 * (length + breadth)));
	}

}

public class AbstractDemo {

	public static void main(String[] args) {
		Shapee s = new Rectanglee(10, 20);
		s.area();
		s.perimeter();
	}

}
