package overrriding;

public class Student extends Person {

	// Field declaration
	String course;
	int rollNum;

	public Student(String name, int age, String course, int rollNum) {
		super(name, age);
		this.course = course;
		this.rollNum = rollNum;
	}

	@Override
	void display() {
		super.display();
		System.out.println("Course\t\t= " + course);
		System.out.println("Roll no.\t= " + rollNum);
	}

}