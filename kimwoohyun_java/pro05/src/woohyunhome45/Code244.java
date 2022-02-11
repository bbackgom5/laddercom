package woohyunhome45;

import java.util.Iterator;
import java.util.TreeSet;

public class Code244 {

	public static void main(String[] args) {
		TreeSet<Person> ts = new TreeSet<Person>();
		ts.add(new Person(3,83));
		ts.add(new Person(5,90));
		ts.add(new Person(1,93));
		ts.add(new Person(2,88));
		ts.add(new Person(4,70));
		
		Iterator<Person> itr = ts.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

	}

}
