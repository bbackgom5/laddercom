package pro01;

public class Woohyun54 {

	public static void main(String[] args) {
		int data[][] = new int[3][0]; 
		
		
		data[0] = new int[3];
		data[1] = new int[2];
		data[2] = new int[1];
		
		data[0][0]= 1;
		data[0][1]= 2;
		data[0][2]= 3;
		
		data[1][0]= 0;
		data[1][1]= 1;
		
		data[2][0]= 3;
		
		for (int i = 0; i<data.length; i++) {
			for (int j = 0; j<data[i].length; j++)
				System.out.print(data[i][j]+ " ");
			System.out.println();
		}

	}

}
