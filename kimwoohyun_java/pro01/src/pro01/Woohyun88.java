package pro01;

class Parent7 {
	void print() {
		System.out.println("I am parent print");
	}
}

class Child7 extends Parent7 {
	void print() {
		super.print();
	}
}

public class Woohyun88 {

	public static void main(String[] args) {
		Child7 c = new Child7();
		c.print();

	}

}
