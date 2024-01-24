package assessment;

import java.util.Scanner;

public class SmallAlpha {

	public static void main(String[] args) {
		System.out.println("Enter : ");
		Scanner s= new Scanner(System.in);
		String input=s.nextLine();
		int count=0;
		for(int i=0;i<input.length();i++)
		{
			if('a'<= input.charAt(i) && input.charAt(i)<='z')
			{
				count+=1;
			}
		}
		if(count==input.length())
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}

	}

}
