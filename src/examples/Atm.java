package examples;

import java.util.Scanner;

public class Atm {
	static Account a=new Account();
	static Scanner sc=new Scanner(System.in);
	public void withdraw() {
		System.out.println("enter ac no.:");
		long acNo=sc.nextLong();
		if(a.getAccNo()==acNo)
		{
			System.out.println("enter pass :");
			int pass=sc.nextInt();
			if(a.getPswd()==pass)
			{
				System.out.println("enter money :");
				double mon=sc.nextDouble();
				if(a.getBal()>=mon)
				{
					double dc=a.getBal()-mon;
					a.setBal(dc);
				}
				else
				{
					System.out.println("insufficient money");
				}
			}
			else
			{
				System.out.println("invalid pswd");
			}
		}
		else
		{
			System.out.println("invalid AccNo");
		}
	}
	public void deposit() {
		System.out.println("enter amount");
		double d=(a.getBal()+sc.nextDouble());
		a.setBal(d);
	}
	public void checkBalance() {
		System.out.println(a.getBal());
	}
	public static void main(String[] args) {
		Atm a1=new Atm();
		for(;;)
		{
			System.out.println("1.withdraw");
			System.out.println("2.checkBalance");
			System.out.println("3.deposit");
			System.out.println("4.exit");
			
			switch(sc.nextInt())
			{
			case 1:
				a1.withdraw();
				break;
			case 2:
				a1.checkBalance();
				break;
			case 3:
				a1.deposit();
				break;
			case 4:
				System.exit(1);
			}
		}

	}

}
