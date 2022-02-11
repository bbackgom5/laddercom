package pro01;

class Parent6 {
	int data = 10;
}

class Child6 extends Parent6 {
	int data = 20;
	void printData() {
		System.out.println("data from Parent6 : " + super.data);
		System.out.println("data from Child6 : " + this.data);
		System.out.println("data from Child6 : " + data);
		
	}
}
public class Woohyun87 {

	public static void main(String[] args) {
		Child6 c = new Child6();
		c.printData();

	}

}
