package pro01;

class Circle2{
	final double PI= 3.141592;
	private double radius;
	
	Circle2(){}
	Circle2(double radius){
		this.radius=radius;
	}
	double getRadius() {
		return radius;
	}
	void setRadius(double radius) {
		this.radius=radius;
	}
}

public class Woohyun89 {

	public static void main(String[] args) {
		Circle2 c1 =new Circle2(1.5);
		Circle2 c2 =new Circle2(2.2);
		
		double c1Area = c1.PI*c1.getRadius()*c1.getRadius();
		double c2Area = c1.PI*c2.getRadius()*c2.getRadius();
		
		System.out.println("c1 area : " +c1Area);
		System.out.println("c2 area : " +c2Area);

	}

}
