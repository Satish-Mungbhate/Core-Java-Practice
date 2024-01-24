package practice;

public class MaxRepeatingChar {

	public static void main(String[] args) {
		String s="satish";
		int a[]=new int [256];
		for(int i=0;i<s.length();i++)
		{
			a[s.charAt(i)]=a[s.charAt(i)]+1;
		}

		int max=0;
		char c=' ';
		for(int j=0;j<s.length();j++)
		{
			if(max<a[s.charAt(j)])
			{
				max=a[s.charAt(j)];
				c=s.charAt(j);
			}
		}
		System.out.println(c);
	}

}
