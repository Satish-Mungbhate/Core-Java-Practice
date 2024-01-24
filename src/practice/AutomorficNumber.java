package practice;

public class AutomorficNumber {

	public static void main(String[] args) {	
		for(int i=1;i<=100;i++)
		{
			int rem=0,rem1=0,temp,sqr;
			sqr=i*i;
			temp=i;
			for(int j=0;temp>0;j++)
			{
				rem=rem*10+(temp%10);
				rem1=rem1*10+(sqr%10);
				temp/=10;
				sqr/=10;
			}
			if(rem==rem1)
			{
				System.out.println(i);
			}
		}
	}
	/*public static void main(String[] args) {
		int n=4,rem=0,rem1=0,temp=n;
		int sqr=n*n;
		for(int i=0;temp>0;i++)
		{
			rem=rem*10+(temp%10);
			rem1=rem1*10+(sqr%10);
			temp/=10;
			sqr=10;
		}
		if(rem==rem1)
		{
			System.out.println("is a automorfic Number");
		}
		else
		{
			System.out.println("is not a automorfic Number");
		}
	}*/

}



