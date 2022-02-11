package practice09;

public class MyException extends Exception {

	int x;
	MyException(int x) {
		this.x = x;
	}
@Override	
	public String toString() {
		return "I am " + x + " in MyException class";
	}
}
