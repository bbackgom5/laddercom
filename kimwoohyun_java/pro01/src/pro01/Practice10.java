package pro01;
class Classmate {
	String name;
	int age;
	
	Classmate(String n, int a){
		name = n;
		age = a;
	}
	
	
	
	void printClassmate() {
		System.out.println("name : " +name+", age : " +age);
	}
}

public class Practice10 {

	public static void main(String[] args) {
		Classmate f= new Classmate("�и�", 30);
		f.printClassmate();
	}

}
