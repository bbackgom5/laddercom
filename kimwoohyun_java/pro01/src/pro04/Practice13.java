package pro04;

class Parent {
	void printParent(){
		System.out.println("I am Parent");
	}
}

class Child extends Parent{
	private int data;
	Child(int data){
		this.data=data;
	}
	void printChild() {
		System.out.println("data: " + data);
	}
}

public class Practice13 {

	public static void main(String[] args) {
		Child c = new Child(10);
		c.printParent();
		c.printChild();

	}

}
