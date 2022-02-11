package practice03;

public class Code165 {

	public static void main(String[] args) {
		Person t1 = new Teacher(112, "Alice" , "Math");
		Person t2 = new Teacher(115, "Paul" , "English");
		Student s1 = new Student(5, "David" , 2);
		Student s2 = new Student(7, "Cindy" , 1);
		
		t1.show();
		System.out.println();
		t2.show();
		System.out.println();
		s1.show();
		System.out.println();
		s2.show();
		System.out.println();

	}

}
