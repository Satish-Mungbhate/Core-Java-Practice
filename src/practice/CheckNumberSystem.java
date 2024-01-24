package practice;

public class CheckNumberSystem {

	public static void main(String[] args) {
				int n=96;
				int temp1=n;
				int temp2=n;
				int temp3=0;
				int rem;
				int length=0;
				for(int i=1;temp1>0;i++)
				{
					length++;
					temp1=temp1/10;
				}
				for(int j=1;j<=length;j++)
				{
					rem=temp2%10;
					temp2=temp2/10;
					if(temp3<rem)
					{
						temp3=rem;
					}
				}
				if(temp3<=1)
				{
					System.out.println(n+" is a  Binary Number");
				}
				else if(temp3<=7)
				{
					System.out.println(n+" is a Octal Number");
				}
				else if(temp3<=9)
				{
					System.out.println(n+" is a Decimal Number");
				}

	}

}
