package pro01;

class Parent5{
	private int dataA;
	
	Parent5() {}
	Parent5(int dataA){
		this.dataA=dataA;
	}
	void printA() {
		System.out.println("dataA : " +dataA);
	}
}

class Child5 extends Parent5{
	private int dataB;
	
	Child5(){}
	Child5(int dataA, int dataB){
		super(dataA);
		this.dataB=dataB;
	}
	void printB() {
		System.out.println("dataB : " +dataB);
	}
}
public class Woohyun86 {

	public static void main(String[] args) {
		Child5 c = new Child5(10,20);
		c.printA();
		c.printB();

	}

}
