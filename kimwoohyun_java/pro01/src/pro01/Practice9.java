package pro01;
class Point4 {
	int x;
	int y;
	Point4() {
		x = 10;
		y = 20;
	}
	
	void print() {
		System.out.println("(" + x + ", " + y +")");
	}
}
public class Practice9 {

	public static void main(String[] args) {
		Point4 p1 = new Point4();
		Point4 p2 = new Point4();
		
		p1.print();
		p2.print();

	}

}
