package pro01;

public class Practice2 {

	public static void main(String[] args) {
		
	for (int i=1;i<=7;i++)
	{
		System.out.println("before continue : " + i);
		if (i % 2 == 0) continue;
		System.out.println("*******after continue : " + i);
	}
		
	}

}
