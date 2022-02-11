package woohyunhome50;

public class Code251 {

	public static void main(String[] args) {
		Thread t = new NumberThread();
		t.start();
		for (char ch = 'A'; ch <= 'Z'; ch++)
			System.out.print(ch);

	}

}
