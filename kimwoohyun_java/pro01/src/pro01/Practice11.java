package pro01;
class Student3 {
	static int numberOfStudent;
	String name;
	double score;
	
	Student3(){
		numberOfStudent++;
	}
	Student3(String n, double s) {
		numberOfStudent ++;
		name = n;
		score = s;
	}
	void print () {
		System.out.println("name : " + name);
		System.out.println("score : " + score);
		System.out.println("numberOfStudent : " + numberOfStudent);
	}
}
public class Practice11 {

	public static void main(String[] args) {
		Student3  s1 = new Student3("Alice",90.5);
		Student3  s2 = new Student3("David",88.3);
		Student3  s3 = new Student3("Cindy",77.1);
		
		s1.print();
		s2.print();
		s3.print();

	}

}
