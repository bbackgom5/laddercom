package woohyunhome46;

public class Person {
	private int id;
	private int score;
	Person(){}
	Person(int id, int score){this.id = id; this.score = score;}
	int getId() {return id;}
	@Override
	public String toString() {return "[id = " +id+ ", score= " +score+"]";}
}
