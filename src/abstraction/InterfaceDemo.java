package abstraction;

interface Shape{
	void area();
	void perimeter();
}

class Rectangle implements Shape{

	private int length, breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void area() {
		System.out.println("Area = "+(length*breadth));
	}

	@Override
	public void perimeter() {
		System.out.println("Perimeter = "+(2*(length+breadth)));
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {

		Shape s =new Rectangle(40, 60);
		s.area();
		s.perimeter();
	}

}
