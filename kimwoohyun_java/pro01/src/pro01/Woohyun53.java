package pro01;

public class Woohyun53 {

	public static void main(String[] args) {
		int[][]data = new int [3][4];
		data[0][0] = 10;
		data[0][1] = 15;
		data[0][2] = 7;
		data[0][3] = 3;
		data[1][0] = 1;
		data[1][1] = 5;
		data[1][2] = 17;
		data[1][3] = 30;
		data[2][0] = 20;
		data[2][1] = 2;
		data[2][2] = 6;
		data[2][3] = 13;
		
		int [][]data1 = {{10,5,7,3},
				       {1,5,17,30},
				       {20,2,6,13}};
		
		int [][]data2 = {{3,1,7,8},
		                 {9,2,2,5},
		                 {1,3,5,7}};
		for (int i = 0; i<3; i++) {
			for (int j =0; j<4; j++) {
				System.out.print(data2[i][j] + " ");
			}
		System.out.println();
		
		

		}
	}

}
