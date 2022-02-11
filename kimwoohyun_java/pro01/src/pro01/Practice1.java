package pro01;

public class Practice1 {

	public static void main(String[] args) {
		int i = 1, sum = 0;
		for (;i<=10;i++)
		{
			sum += i;
		}
		System.out.println("sum : "+sum);
		
		int i1=1, sum1 = 0;
		for (;i1 <=10;)
		{
			sum1 += i1;
			i1++;
		}
		System.out.println("sum1 : "+sum1);
		
		int i2=1, sum2=0;
		for (;;)
		{
			sum2 += i2;
			i2++;
			if (i2==11) break;
		}
		System.out.println("sum2 : "+sum2);
		
	}

}

