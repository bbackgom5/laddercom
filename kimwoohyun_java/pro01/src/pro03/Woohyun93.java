package pro03;

class Parent {}

class Child extends Parent{}


public class Woohyun93 {
	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1-Child�� ��ȯ ����");
		}
		else {
			System.out.println("method1-Child�� ��ȯ���� ����");
		}
	}

	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);

	}

}
