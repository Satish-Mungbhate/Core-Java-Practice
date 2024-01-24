package practice;

public class DuplicateNumber {

	public static void main(String[] args) {
		int rem1,rem2,temp,m=0;
		for(int i=1;i< 100;i++)
		{
			if(i>9)
			{
			m=i;
			rem1=m%10;
			temp=m/10;
			rem2=temp%10;
			if(rem1==rem2)
			{
				System.out.println(i);
			}
			}
		}

	}

}
