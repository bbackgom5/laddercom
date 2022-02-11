package practice01;

public class Child extends Parent{
	private int dataB;
	Child(){}
	Child(int dataA, int dataB) {
		super(dataA);
		this.dataB = dataB;
	}
	void show() {
		super.show();
		System.out.println("child show : " + dataB);
	}

}
