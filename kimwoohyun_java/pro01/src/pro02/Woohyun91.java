package pro02;

class Parent {
	int a = 10;
	void show() {
		System.out.println("I am parent show");
	}
}

class Child1 extends Parent {
	int b=20;
	void show1() {
		System.out.println("I am child1 show");
	}
}

class Child2 extends Parent {
	int c =30;
	void show2() {
		System.out.println("I am child2 show");
	}
}

public class Woohyun91 {

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		System.out.println("c1.a : " + c1.a);
		System.out.println("c1.b : " + c1.b);
		System.out.println("c2.a : " + c2.a);
		System.out.println("c2.b : " + c2.c);
		c1.show();
		c1.show1();
		c2.show();
		c2.show2();
		
	}

}
