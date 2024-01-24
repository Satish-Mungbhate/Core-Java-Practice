package practice;

public class FibonacciNumber {
	public static void main(String[] args) {
		int a=0,b=1,c;
		System.out.print(a+" "+b);
		
		for(int i=1;i<=5;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		} 
		
	}

}