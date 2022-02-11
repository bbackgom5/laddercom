package pro01;
class Student{
	int no;
	String name;
	double score;
	
	Student(int n) {
		no = n;
	}
	void printStudent() {
		System.out.println("no : " + no + " , name : " +name+ ", score : " +score);
	}
}

public class Woohyun71 {

	public static void main(String[] args) {
		
		Student s2= new Student(10);
		
		
		s2.printStudent();

	}

}
