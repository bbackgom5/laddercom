package pro01;

import java.util.Arrays;

public class Woohyun52 {

	public static void main(String[] args) {
		int data1[]= {4,2,9,10,1};
		int data2[];
		
		data2=data1;
		data1[2]=5000;
		System.out.println("data1 : "+Arrays.toString(data1));
		System.out.println("data2 : "+Arrays.toString(data2));

	}

}
