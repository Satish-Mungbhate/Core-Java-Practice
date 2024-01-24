package practice;

public class ArmstongNumber {

	public static void main(String[] args) {
		for(int n=1;n<=1000;n++)
		{
		//int n=153;
		int temp,rem;
		int digit=0;
		int sum=0;
		int temp2=n;
		temp=n;
		for(int j=1;temp>0;j++)
		{
			digit=digit+1;
			temp=temp/10;
		}
		for(int k=1;temp2>0;k++)
		{
			int mul=1;
			rem=temp2%10;
			for(int i=1;i<=digit;i++)
			{
			mul=mul*rem;
			}
			sum=sum+mul;
			temp2=temp2/10;
		}
		if(n==sum)
		{
			System.out.println(n);
			// System.out.println("Armstrong number");
		}
		/*else
		{
			System.out.println("Not Armstrong Number");
		}*/
	} 
		
	}

}
