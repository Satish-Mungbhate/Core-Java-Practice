package practice;

public class DecimalBinary {

	public static void main(String[] args) {
	int x=123;
	int rem=0;
	for(int i=1;x>0;i++)
	{
		rem=x%2;
		x=x/2;
		System.out.print (rem);
	}
	}

}
