package pro01;
class Friend1 {
	String name;
	int age;
	
	
	Friend1() {}
	Friend1(String n, int a) {
		name = n;
		age = a;
	}
	void printFriend() {
		System.out.println("name : " + name + " , age : " + age);
	}
}

public class Woohyun70 {

	public static void main(String[] args) {
		Friend1 f= new Friend1("Alice",20);
		f.printFriend();

	}

}
