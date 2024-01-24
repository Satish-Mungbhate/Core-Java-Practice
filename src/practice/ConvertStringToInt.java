package practice;

public class ConvertStringToInt {

	/*public static void main(String[] args) {
		String s="satish";
		int i=Integer.parseInt(s);
		int j=Integer.valueOf(s);
		System.out.println(i);
		System.out.println(j);
	}*/

	public static void main(String[] args) {
		String s="satish";
		int num=0;
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			num=num*10+((int)s.charAt(i)-48);
		}
		System.out.println("this is integer no.= "+num);
	}
	
}
