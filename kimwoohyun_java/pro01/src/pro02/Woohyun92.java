package pro02;

class Parent1 {
	void print() {
		System.out.println("parent-print method");
	}
	void test() {
		System.out.println("Parent-test method");
	}
}

class Child extends Parent1 {
	void print() {
		System.out.println("child-print method");
	}
	void check() {
		System.out.println("child-check method");
	}
}

public class Woohyun92 {

	public static void main(String[] args) {
		Parent1 p =new Parent1();
		p.print();
		p.test();
		
		Child c =new Child();
		c.print();
		c.check();
		c.test();
		
		Parent1 x = new Child();
		x.print();
		x.test();

	}

}
