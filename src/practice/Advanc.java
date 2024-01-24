package practice;

import java.util.Scanner;

public class Advanc {
	public void m1(int n, int m)
	{
		int result;
		result=n/m;
		System.out.println("Total of Number="+result);
	}

	public static void main(String[] args) {
		int n,m;
		System.out.println("Enter number=");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println("Enter Number=2");
	    m=s.nextInt();
	    Advanc a=new Advanc();
	    a.m1(n , m);
		
	}

}
