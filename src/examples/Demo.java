package examples;

public class Demo {
	static int x=10;
	Demo(){
		x++;
		System.out.println(x);
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		Demo d1=new Demo();
		Demo d2=new Demo();
	}

}
