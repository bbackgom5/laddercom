package pro04;
class Parent3 {
	void show() {
		System.out.println("I am parent show");
	}
	void show(int data) {
		System.out.println("I am parent show - data : " + data);
	}
	void show(String msg) {
		System.out.println("I am parent show : " +msg);
		}
}

class Child4 extends Parent3{
	void show(int data) {
		super.show(data);
	}
}
public class Practice16 {

	public static void main(String[] args) {
		Child4 c = new Child4();
		c.show();
		c.show(100);
		c.show("Hello");

	}

}
