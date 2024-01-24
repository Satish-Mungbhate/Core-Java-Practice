package parameterised;

public class Para {
	public void add(int x ,float y)
	{
		System.out.println(x*y);
	}
	public static void main(String[] args) {
		Para b=new Para();
		b.add('a', 3.3f);
	}

}
