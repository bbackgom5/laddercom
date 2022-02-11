package pro01;

class Parent4 {
	Parent4(){
		System.out.println("parent constructor is called");
	}
	void printParent4() {
		System.out.println("I am parent");
	}
}

class Child4 extends Parent4 {
	Child4 () {
		System.out.println("child constructor is called");
	}
	void printChild4() {
		System.out.println("I am child");
	}
}

public class Woohyun85 {

	public static void main(String[] args) {
		Child4 c = new Child4();
		c.printParent4();
		c.printChild4();

	}

}
