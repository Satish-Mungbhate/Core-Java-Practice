package practice;

public class SumOfGivenDigit {

	public static void main(String[] args) {
		int n=123456789;
		int rem,sum=0;
		int temp,temp2,digit=0;
		temp=n;
		for(int i=1;temp>0;i++)
		{
			digit++;
			temp=temp/10;
		}
		temp2=n;
		for(int j=1;j<=digit;j++)
		{
			rem=temp2%10;
			sum=sum+rem;
			temp2=temp2/10;
		}
		System.out.println(sum);
	}

}
