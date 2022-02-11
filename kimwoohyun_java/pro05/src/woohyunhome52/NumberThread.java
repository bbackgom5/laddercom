package woohyunhome52;

public class NumberThread extends Thread {
	String name;
	NumberThread(String name){
		this.name = name;
	}
	@Override
	public void run() {
		System.out.println(name + " starting");
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(300);
				System.out.println("In " + name + " : " + i);
			}
		}catch(InterruptedException e) {
				System.out.println(e);
			}
		System.out.println(name + " terminating");
	}
}
