package woohyunhome51;

public class Code254 {

	public static void main(String[] args) {
		Thread t = new Thread(new NumberThread());
		t.start();
		for (char ch = 'A'; ch <= 'Z'; ch++)
			System.out.print(ch);

	}

}
