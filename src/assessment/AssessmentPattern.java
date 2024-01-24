package assessment;

import java.util.Scanner;

public class AssessmentPattern {

	public static void main(String[] args) {
		System.out.println("Enter : ");
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		int x=input.length();
		for(int i=0;i<x;i++)
		{
			for(int k=x;k>i;k--)
			{
				if(k%2==0)
				{
				System.out.print(" ");
				}
			}
			for(int j=0;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
