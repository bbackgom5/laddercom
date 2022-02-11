package woohyunhome51;

public class NumberThread implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 26; i++)
			System.out.print(i);
	}

}
