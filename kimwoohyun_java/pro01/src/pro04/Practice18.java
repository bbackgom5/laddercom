package pro04;
class Car {
	private String color;
	Car(){}
	Car(String color){this.color=color;}
	void drive() {System.out.println("driving...");}
}

class Sedan extends Car {
	private int seats;
	Sedan(){}
	Sedan(String color,int seats) {
		super(color);
		this.seats=seats;
	}
	void showSeats() {System.out.println("This car has " + seats + " seats.");}
}

class Truck extends Car {
	private int wheel;
	Truck(){}
	Truck(String color,int wheel){
		super(color);
		this.wheel=wheel;
	}
	void showWheel() {
		System.out.println("This truck is " +wheel+" drive truck");
	}
}

public class Practice18 {

	public static void main(String[] args) {
		Car myCar = new Sedan("white",4);
		Car yourCar = new Truck("blue",4);
		
		if (myCar instanceof Sedan)
			((Sedan)myCar).showSeats();
		if (yourCar instanceof Truck)
			((Truck)yourCar).showWheel();

	}

}
