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
		d.name = "����";      //d.name = ( ) , d.color = ( ) �� ��� ������ ������ �⺻������ ����
	    d.color = "white";
		d.printDog3();

	}

}
