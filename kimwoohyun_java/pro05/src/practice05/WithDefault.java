package practice05;

public interface WithDefault {
	int COUNT = 100;
	void test();
	 default void show() {
		System.out.println("I am show");
	}
}
