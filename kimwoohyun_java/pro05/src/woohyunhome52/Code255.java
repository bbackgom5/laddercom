package woohyunhome52;

public class Code255 {

	public static void main(String[] args) {
		System.out.println("main starting");
		Thread th = new Thread(new NumberThread("Number Thread"));
		th.start();
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(300);
				System.out.println("In main : " + i);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("main ending");
	}

}
