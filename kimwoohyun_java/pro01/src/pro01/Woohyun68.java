package pro01;
class Friend {
	String name;
	int age;
	
	void printFriend() {
		System.out.println("name : " + name + " , age : " + age);
	}
}
public class Woohyun68 {

	public static void main(String[] args) {
		Friend f = new Friend();
		f.printFriend();
		f.name = "Alce";
		f.age = 20;
		f.printFriend();

	}

}
