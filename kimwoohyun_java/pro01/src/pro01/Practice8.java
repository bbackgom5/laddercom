package pro01;
class Dog3 {
	String name;
	String color;
	
	void printDog3() {
		System.out.println("name : " + name);
		System.out.println("color : " + color);
	}
	
}

public class Practice8 {

	public static void main(String[] args) {
		Dog3 d = new Dog3();
		d.name = "떵개";      //d.name = ( ) , d.color = ( ) 를 명시 해주지 않으면 기본값으로 나옴
	    d.color = "white";
		d.printDog3();

	}

}
