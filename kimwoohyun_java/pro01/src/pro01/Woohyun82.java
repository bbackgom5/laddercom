package pro01;
class Student01 {
	private String name;
	private int score;
	
	Student01(String name, int score) {
		this.name = name;
		this.score = score;
	}
	String getName() {
		return name;
	}
	int getScore() {
		return score;
	}
	void print() {
		System.out.println(name+ "(" + score + ")");
	}
}
public class Woohyun82 {

	public static void main(String[] args) {
		Student01 st[]=new Student01[5];
		st[0]= new Student01("Alice", 88);
		st[1]= new Student01("Tom", 98);
		st[2]= new Student01("Jenny", 80);
		st[3]= new Student01("Betty", 79);
		st[4]= new Student01("Daniel", 91);
		
		st[0].print();
		st[1].print();
		st[2].print();
		st[3].print();
		st[4].print();
		
		int total = 0;
		for (int i =0; i<st.length; i++)
			total += st[i].getScore();
		double average = (double) total / st.length;
		System.out.println("average : " + average);
		
	}

}
