package pro03;

class Parent1 {
	void print() {
		System.out.println("Parent : print()");
	}
	void show() {
		System.out.println("Parent : show()");
	}
}

class ChildA extends Parent1 {
	void print() {
		System.out.println("Child-A : print()");
	}
	void showA() {
		System.out.println("Child-A : show()");
	}
}

class ChildB extends Parent1 {
	void print() {
		System.out.println("Child-B : print()");
	}
	void showB() {
		System.out.println("Child-B : show()");
	}
}

public class Woohyun94 {
	static void doWork(Parent1 p) {
		if (p instanceof ChildA) {
			ChildA ca = (ChildA) p;
			ca.print();
			ca.show();
			ca.showA();
		}
		else if (p instanceof ChildB) {
			ChildB cb = (ChildB) p;
			cb.print();
			cb.show();
			cb.showB();
		}
		else {
			p.print();
			p.show();
		}
	}

	public static void main(String[] args) {
		Parent1 p = new Parent1();
		ChildA a = new ChildA();
		ChildB b = new ChildB();
		
		doWork(p);
		doWork(a);
		doWork(b);

	}

}
