package practice;

public class BubbleSortString {

	public static void main(String[] args) {
		String [] s= {"Satish","lalit","bhushan","sanket","Akshay"};
		String temp;
		int l=s.length;
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(s[j].compareToIgnoreCase(s[i])< 0)
				{
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		System.out.print(s[i]+" ");	
		}
	}

}
