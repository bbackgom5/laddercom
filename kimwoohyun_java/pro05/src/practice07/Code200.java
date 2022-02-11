package practice07;

public class Code200 {

	public static void main(String[] args) {
		int a = 5, b = 0, c;
		int A[] = new int[3];
		
		try {
			A[3] = 100;
			c = a / b;
		}catch(Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		finally {
			System.out.println("finally 구문");
		}

	}
}
