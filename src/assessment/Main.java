package assessment;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter=");
		String inputLine=input.nextLine();
		
		char flag=' ';
		if(!inputLine.isEmpty())
		{
		for(char i:inputLine.toCharArray())
		{
			if(inputLine.indexOf(i)==inputLine.lastIndexOf(i))
			{
				flag=i;
				break;
			}
		}
			
		    if(flag==' ') 
		    {
		    	System.out.println("repeating ");
		    }
		    else
		    {
		    	System.out.println("First non re char ="+flag);
		    }
		
		}
		else
		{
			System.out.println("Empty");
		}
	}
		
}
