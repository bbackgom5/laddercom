package pro04;

class Parent1{
	private int data = 10;
	int getData() {
		return data;
	}
}

class Child1 extends Parent1{
	int data = 20;
	void printData() {
		System.out.println("data from Parent1 : " + super.getData());
		System.out.println("data from Child1 : " + this.data);
		System.out.println("data form Child1 : " +data);
	}
}
public class Practice14 {

	public static void main(String[] args) {
		Child1 c = new Child1();
		c.printData();

	}

}
