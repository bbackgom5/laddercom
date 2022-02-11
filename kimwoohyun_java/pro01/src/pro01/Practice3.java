package pro01;
public class Practice3 {

	public static void main(String[] args) {
		int score = 92;
		if (score >= 90)
			System.out.println("Excellent!");
		else if (score >= 80)
			System.out.println("Good!");
		else if (score >= 70)
			System.out.println("Ok");
		else
			System.out.println("Not ok");

	
				
				int score2 = 80;
				switch(score2) {
				case 90:
					System.out.println("Your score2 is 90");
				case 80:
					System.out.println("Your score2 is 80");
				case 70:
					System.out.println("Your score2 is 70");
					break;
					default:
						System.out.println("Your score2 is under 70");
						
						
				}
		}
	}


