package assessment;

import java.util.Scanner;

public class Main1 {
		public static void main(String[] args) {
			char flag=' ';
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the character or string:");
			String inputLine=input.nextLine();
			
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
		    	System.out.println("repeating or "+"empty");
		    }
		    else
		    {
		    	System.out.println("First non repeating character ="+flag);
		    }
			  	
		}

	}

