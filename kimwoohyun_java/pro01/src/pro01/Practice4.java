package pro01;

public class Practice4 {

	public static void main(String[] args) {
		double[] score = {90.5, 88.1, 85.3, 86.4 , 77.5 , 60.5, 70.2};
		double total = 0.0;
		double average;
		for (double s : score)
			total += s;
		average = total/score.length;
		System.out.println("average : "+average);

	}

}
