package practice03;

public abstract class Person {
	private int no;
	private String name;
	
	Person(){}
	Person(int no, String name){
		this.no = no;
		this.name = name;
	}
	int getNo() {
		return no;
	}
	String getName() {
		return name;
	}
	abstract void show();
}
