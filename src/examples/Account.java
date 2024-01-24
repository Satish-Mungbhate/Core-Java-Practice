package examples;

public class Account {
	private String name="Satish";
	private long accNo=1234567890;
	private int pswd=1234;
	private double bal=10000;
	public String getName() {
		return name;
	}
	public long getAccNo() {
		return accNo;
	}
	public int getPswd() {
		return pswd;
	}
	public double getBal() {
		return bal;
	}
	public void setName(String s) {
		name=s;
	}
	public void setAccNo(long s) {
		accNo=s;
	}
	public void setPswd(int s) {
		pswd=s;
	}
	public void setBal(double s) {
		bal=s;
	}
}







