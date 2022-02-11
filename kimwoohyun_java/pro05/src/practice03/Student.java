package practice03;

public class Student extends Person{
	private int year;
	
	Student(){}
	Student(int no, String name, int year){
		super(no,name);
		this.year = year;
	}
	void show() {
		System.out.println("Student Information");
		System.out.println("-------------------");
		System.out.println("number : " +getNo());
		System.out.println("number : " +getName());
		System.out.println("subject : " +this.year);
	}

}
