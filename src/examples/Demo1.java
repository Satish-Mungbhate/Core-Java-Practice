package examples;

public class Demo1 {
	public static void main(String[] args) {
		String s1="satish";
		String s2="satish";
		String s3=new String("satish");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	}

}
