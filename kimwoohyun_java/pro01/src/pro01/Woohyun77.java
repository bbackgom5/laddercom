package pro01;
class Person {
	static int count;
	String name;
	
	Person() {
		count ++;
	}
	static void printCount() {
		System.out.println("count : " + count);
	}
}

public class Woohyun77 {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person.printCount();
		p1.printCount();
		p2.printCount();
	}

}
