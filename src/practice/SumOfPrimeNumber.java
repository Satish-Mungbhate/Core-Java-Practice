 package practice;

public class SumOfPrimeNumber {

	public static void main(String[] args) {
		int sum=0;
		int digit=0;
		for(int n=2;n<=100;n++)
		{
			int count=0; 
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				//digit++;
				sum=sum+n;
			}
			/*if(digit==100)
			{
				break;
			}*/
		}
		System.out.println(sum);
	}

}
