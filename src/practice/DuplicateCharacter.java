package practice;

public class DuplicateCharacter {

	public static void main(String[] args) {
		String s="bhushan";
		int x=s.length();
		for(int i=0;i<x;i++)
		{
			for(int j=i+1;j<x;j++)
			{
			if(s.charAt(i)==s.charAt(j))
			{
				System.out.println("Duplicate Character is "+s.charAt(i));
			}
		}
	}

}
}
