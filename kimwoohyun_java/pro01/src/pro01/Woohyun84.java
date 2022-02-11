package pro01;
class Person4 {
	private String name;
	private String phone;
	
	Person4(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	void printPerson4() {
		System.out.println("name : " + name);
		System.out.println("phone : " + phone);
	}
}

class Student4 extends Person4 {
	private int score;
	Student4(String name, String phone , int score) {
		super(name,phone);
		this.score=score;
	}
	void printStudent4() {
		printPerson4();
		System.out.println("score : " + score);
	}
}

public class Woohyun84 {

	public static void main(String[] args) {
		Student4 s = new Student4("Alice", "010-111-1111",90);
		s.printStudent4();
	}

}
