package collection;

public class Student { // Model class or bean
	String name; // Made by -> Identify field >> Constructor >> GetterSetter
	int age;
	String course;

	// Generate constructor using fields
	public Student(String name, int age, String course) {
		super(); // Object is super class of every class [Not needed here]
		this.name = name;
		this.age = age;
		this.course = course;
	}

	// Generate getter & setter >> Select Getters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCourse() {
		return course;
	}

	@Override
	public String toString() {
		// return super.toString(); Change return type
		return (name + " " + age + " " + course);
	}

}
