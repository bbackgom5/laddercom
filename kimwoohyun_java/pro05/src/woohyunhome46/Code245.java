package woohyunhome46;

import java.util.TreeSet;

public class Code245 {

	public static void main(String[] args) {
		TreeSet<Person> ts = new TreeSet<>(new PersonComparator());
		ts.add(new Person(4,83));
		ts.add(new Person(5,90));
		ts.add(new Person(2,93));
		ts.add(new Person(1,88));
		ts.add(new Person(3,70));
		for(Person p:ts)
			System.out.println(p);

	}

}
