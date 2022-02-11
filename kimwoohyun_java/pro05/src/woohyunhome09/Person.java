package woohyunhome09;

abstract class Person {
	abstract void print();

}

class Teacher extends Person {
	void print() {
		System.out.println("teacher");
	}
}

class Student extends Person{
	void print() {
		System.out.println("student");
	}
}