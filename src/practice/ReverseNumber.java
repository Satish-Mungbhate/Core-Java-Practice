package practice;

public class ReverseNumber {

	public static void main(String[] args) {
		int n=78965 ;
		int rev=0,rem;
		for(int i=1;n>0;i++)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
	}

}
