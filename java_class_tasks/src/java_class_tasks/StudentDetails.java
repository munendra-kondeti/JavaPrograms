package java_class_tasks;

public class StudentDetails {
	String name;
	int age;
	int rollno;


	public StudentDetails(String name, int age, int rollno) {

		this.name =name;
		this.age = age;
		this.rollno = rollno;
	}
	
	void printOut() {
		System.out.println("your name "+ name + "\nyour age "+age+"\nrollno "+rollno);
	}
}
