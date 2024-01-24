package practice;

public class ReverseString {
	
	public void m1(String s)
	{
		/*int rev;
		int n=s.length()-1;
		for(int i=0;n>=0;i++)
		{
			rev=n;
			n--;
		System.out.print(s.charAt(rev));
		}*/
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		
		/*StringBuilder str=new StringBuilder(s);
		str.reverse();
		System.out.print(str);*/
	}

	public static void main(String[] args) {
		ReverseString b=new ReverseString();
		b.m1("Lalit Punse");
	}
}
