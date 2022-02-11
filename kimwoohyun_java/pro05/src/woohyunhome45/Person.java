package woohyunhome45;

public class Person implements Comparable<Person> {
	private int id;
	private int score;
	Person(){}
	Person(int id,int score) {this.id = id; this.score = score;}
	@Override
	public String toString() {return "[id=" + id +", score =" + score + "]";}
	public int compareTo(Person p) {
		return this.id - p.id;
	}
}
