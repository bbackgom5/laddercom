package woohyunhome23;

import java.util.Random;

public class RandomClassExample {

	public static void main(String[] args) {
		Random rand1 = new Random();
		Random rand2 = new Random();
		
		for(int i=0 ; i < 3 ; i++)
			System.out.println(rand1.nextInt()+" ");
		System.out.println();
		
		for(int i=0 ; i <3 ; i++)
			System.out.print(rand2.nextInt(100) + " ");

	}

}
