package woohyunhome10;

interface Person {
	void print();
}

class Teacher implements Person {
	public void print() {
		System.out.println("teacher");
	}
}

class Student implements Person {
	public void print() {
		System.out.println("student");
	}
}