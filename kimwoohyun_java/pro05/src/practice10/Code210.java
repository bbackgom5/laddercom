package practice10;

import java.io.IOException;

public class Code210 {

	public static void main(String[] args) {
		System.out.println("hello world");
		int x;
		try {
			while ((x = System.in.read()) != -1) {
				System.out.print((char)x);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
