package mypackage;

public class Rectangle {

	private int length, breadth;

	public void setData(int l, int b) {
		length = l;
		breadth = b;
	}

	public void display() {
		System.out.println("Length = " + length);
		System.out.println("Breadth = " + breadth);
	}

	public int area() {
		int a = length * breadth;
		return a;
	}

	// Default Constructor = it has no parameters and assigns default values to
	// the objects
	public Rectangle() {
		length = breadth = 50;
	}

	// Parameterized constructor = it has parameters and these parameter values
	// are assigned to the objects
	public Rectangle(int l, int b) {
		length = l;
		breadth = b;
	}

	// Copy constructor = There is no copy constructor in java. But, we can copy
	// the values of one object to another like copy constructor in C++.
	public Rectangle(Rectangle r) {
		length = r.length;
		breadth = r.breadth;
	}

}
