package pro01;

public class Woohyun37 {

	public static void main(String[] args) {
		int score1 = 80;
		char grade1;
		
		switch(score1) {
		case 90: //score�� 90�� ���
			grade1 = 'A';
			break;
		case 80: //score�� 80�� ���
			grade1 = 'B';
			break;
		case 70: //score�� 70�� ���
			grade1 = 'C';
			break;
			default: //�� ���� ���
				grade1 = 'D';
				break;
		}
		System.out.println("grade1 : " +grade1);
		
		
		
	int score2 = 80;
	char grade2;
	
	if (score2 == 90)
		grade2 = 'A';
	else if (score2 == 80)
		grade2 = 'B';
	else if (score2 == 70)
		grade2 = 'C';
	else
		grade2 = 'D';
	System.out.println("grade2 : " + grade2);
	}
	

}
