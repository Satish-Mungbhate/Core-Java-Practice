package practice;

public class Pattern {
	  public static void main(String[] args) {
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=17;j++)
			{
				if(j<4 && i<4) 
				{
					if(j+i==3 || j+i==2 || j+i==4)
					{
					System.out.print("  ");
					}
					else 
					{
					System.out.print("* ");
					}
				}
				else if(j<4 && i>4)
				{
					if(i-j==4 || i-j==5 || i-j==6)
					{
						System.out.print("  ");
					}
					else
					{
						System.out.print("* ");
					}
				}
				else if(4<j && j<14 && i<3)
				{
					System.out.print("  ");
				}
				else if(4<j && j<14 && i>5)
				{
					System.out.print("  ");
				}
				else if(j>14 && i<4)
				{
					if(j-i==14 || j-i==15 || j-i==16)
					{
						System.out.print("  ");
					}
					else
					{
						System.out.print("* ");
					}
				}
				else if(j>14 && 4<i)
				{
					if(j+i==22 || j+i==23 || j+i==24)
					{
						System.out.print("  ");
					}
					else
					{
						System.out.print("* ");
					}
				}
				else
				{
				System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
