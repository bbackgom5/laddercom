package pro04;
class Parent5{
	int a =10;
	void show() {
		System.out.println("I am parent show");
	}
}

class Child5 extends Parent5{
	int b = 20;
	void show1() {
		System.out.println("I am child5 show");
	}
}
class Child6 extends Parent5{
	int c=30;
	void show2() {
		System.out.println("I am child6 show");
	}
}

public class Practice17 {

	public static void main(String[] args) {
		Child5 c1 = new Child5();
		Child6 c2 = new Child6();
		System.out.println("c1.a :" +c1.a);
		System.out.println("c1.b :" +c1.b);
		System.out.println("c2.a :" +c2.a);
		System.out.println("c2.c :" +c2.c);
		c1.show();
		c1.show1();
		c2.show();
		c2.show2();
		

	}

}
