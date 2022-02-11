package pro03;
class Parent2 {
	void printParent() {
		System.out.println("I am parent");
	}
}

class Child2 extends Parent2{
	Child2(){
		System.out.println("child constructor is called");
	}
	void printChild2() {
		System.out.println("I am child");
	}
		
	
}
public class Practice12 {

	public static void main(String[] args) {
		Child2 c = new Child2();
		c.printParent();
		c.printChild2();

	}

}
