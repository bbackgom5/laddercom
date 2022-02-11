package woohyunhome49;

public class Person {
	private String name;
	private int score;
	
	Person(String name, int score){
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return "(" + name +", "+score+")";
	}
}
