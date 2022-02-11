package practice08;

public class Code205 {

	public static void makeArray() {
		int A[] = new int[3];
		try {
		A[0] = 10;
		A[1] = 20;
		A[2] = 30;
		A[3] = 40;
		A[4] = 50;
	}
		catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Exception message : " + e.getMessage());
		}
		}

	public static void main(String[] args) {
		System.out.println("main starts");
		makeArray();
		System.out.println("main ends");
		
}
}