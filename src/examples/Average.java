package examples;

import java.util.*;

public class Average {

	public static void main(String[] args) {
		System.out.println("Enter your marks for first sub :");
		Scanner sc= new Scanner(System.in);
		int x=0;
		for(int i=0;i<5;i++)
		{
		 x=x+sc.nextInt();
		}
		System.out.println(x/5);
	}

}
