package woohyunhome14;

public class Code177 {

	public static void main(String[] args) {
		Thing th1 = new Thing("desk",5);
		Thing th2 = new Thing("desk",5);
		
		if(th1.equals(th2))
			System.out.println("Same Thing");
		
		else System.out.println("Different Thing");

	}

}
