package woohyunhome24;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		int a= 5, b=0, c;
		try {
			c = a / b;
			System.out.println("c : " + c);
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		
	}

	}
}
