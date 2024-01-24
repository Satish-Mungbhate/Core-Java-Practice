package practice;

public class PrimeNumber {
	public static void main(String[] args) {
		//int digit=0;
		for(int n=2;n<=100;n++)
		{
		//int n=4;
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
						//System.out.println("Prime Number");
						System.out.println(n);
					}
					/*else
					{
						System.out.println("Not a Prime Number");
					}
					if(digit==100)
					{
						break;
					}*/
		}
		
	}
}
		
