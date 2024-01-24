package practice;

import java.util.Scanner;

public class EachWordReverse {
	
	public void m2(String s) {
		int n=s.length()-1;
		for(int i=0;n>=i;i++)
		{
			if(s.charAt(i)==' ')
			{
				for(int j=i-1;j>=0;j--)
				{
					if(s.charAt(j)!=' ') {
					System.out.print(s.charAt(j));
					}
					else
					{
						break;
					}
				}
				System.out.print(s.charAt(i));
			}
			if(i==n)
			{
				for(int j=n;j>=0;j--)
				{
					if(s.charAt(j)!=' ') {
					System.out.print(s.charAt(j));
					}
					else
					{
						break;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter text : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		EachWordReverse b=new EachWordReverse();
		b.m2(str);
	}
}

