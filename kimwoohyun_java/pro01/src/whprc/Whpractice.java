package whprc;

class Person {
	private String name;
	private String phone;
	
	Person(){}
	Person(String name, String phone){
		this.name = name;
		this.phone = phone;
	}
	void printPerson() {
		System.out.println("name : " +name);
		System.out.println("phone: " +phone);
	}
}

class Student extends Person {
	private int score;
	
	Student (){}
	Student (String name, String phone, int score) {
		super(name,phone);
		this.score = score;
	}
	void printStudent() {
		printPerson();
		System.out.println("score : " + score);
	}
}
	

	

public class Whpractice {

	public static void main(String[] args) {
			Student s = new Student("Alice", "010-111-1111",90);
			s.printStudent();
		
	}
		
}
