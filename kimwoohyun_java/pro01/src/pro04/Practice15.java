package pro04;

class Parent2 {
	void print() {
		System.out.println("I am parent print");
	}
}
class Child2 extends Parent2 {
	void print() {
		super.print();
	}
}
public class Practice15 {

	public static void main(String[] args) {
		Child2 c = new Child2();
		c.print();

	}

}
