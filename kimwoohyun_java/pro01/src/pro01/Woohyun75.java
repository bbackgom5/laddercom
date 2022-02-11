package pro01;
class Friend2
{
	String name;
	int age;
	
	Friend2(String name,int age){
		this.name = name;
		this.age = age;
	}
	void hello() {
		System.out.println("Hello");
	}
	void printFriend2() {
		this.hello();
		System.out.println("name : " +this.name+ ", age : "+this.age);
	}
}

public class Woohyun75 {

	public static void main(String[] args) {
		

	}

}
