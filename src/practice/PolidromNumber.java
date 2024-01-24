package practice;

public class PolidromNumber {

	public static void main(String[] args) {
		int n=233;
		int temp=n;
		int rev=0,rem=0;
		while(temp>0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==n)
		{
			System.out.println("Palindrom Number");
		}
		else
		{
			System.out.println("Not Palindrom Number");
		}

	}

}
