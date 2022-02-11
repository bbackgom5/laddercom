package pro01;
class Score01 {
	private int math;
	private int english;
	
	Score01(int math , int english) {
		this.math = math;
		this.english = english;
	}
	
	int getMath() {return math;}
	int getEnglish() {return english;}
	void setMath(int math) {this.math=math;}
	void setEnglish(int english) {this.english = english;}
	void incMath(int n) {this.math += n;}
	void incEnglish(int n) {this.english += n;}
	
}
class Student03 {
	private String name;
	private Score01 score01;
	

	Student03(String name, Score01 score01) {
		this.name=name;
		this.score01=score01;
	}
	String getName() {return name;}
	 Score01 getScore01() {return score01;}
	void setName(String name) {this.name=name;}
	void setScore01(Score01 score01) {this.score01=score01;}
	void incScore01(int m, int e) {
		score01.incMath(m);
		score01.incEnglish(e);
	}
	void printStudent03 () {
		System.out.println (name + " : math(" + score01.getMath()+ "), english(" + score01.getEnglish() + ")");
	}
}
public class Woohyun83 {

	public static void main(String[] args) {
		Student03 s1 = new Student03("Alice",new Score01(90,80));
		
		Score01 a = new Score01 (88,93);
		Student03 s2 = new Student03 ("Bob", a);
		
		Student03 s3 = new Student03("Paul", new Score01(78,70));
		Score01 b = new Score01(78,70);
		
		Score01 c = new Score01(90,80);
		
		s3.setName("Paul");
		s3.setScore01(b);
		s2.setName("Bob");
		s2.setScore01(a);
		s1.setName("Alice");
		s1.setScore01(c);
		
		s1.incScore01(3,5);
		s2.incScore01(3, 7);
		s3.incScore01(7, 9);
		
		s1.printStudent03();
		s2.printStudent03();
		s3.printStudent03();
		
	}

}
