package practice;

public class FactorialNumber {

	public static void main(String[] args) {
		int n=50;
		double fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
