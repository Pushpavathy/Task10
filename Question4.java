package task10;

import java.util.Scanner;

class AccountClass
{
	float balance = 10000f;
	float depositAmt =2000f;
	float withdrawAmt =3000f;
	float afterWithdraw;
	float afterDeposit;
	
	public AccountClass()
	{
		afterWithdraw = balance-withdrawAmt;
		System.out.println(" Withdraw balance of account from default constructor is : " + afterWithdraw);
		
		afterDeposit = balance+depositAmt;
		System.out.println(" Deposit balance of account from default constructor is : " + afterDeposit);
	}
	public void WithdrawBalance()
	{
		afterWithdraw = balance-withdrawAmt;
		System.out.println(" Withdraw balance of account is : " + afterWithdraw);	 
	}
	public void DepositBalance()
	{
		afterDeposit = balance+depositAmt;
		System.out.println(" Deposit balance of account is : " + afterDeposit);	 
	}
	public AccountClass(float balance, float withdrawAmt, float depositAmt)
	{
		this.balance = balance;
		this.depositAmt= depositAmt;
		this.withdrawAmt = withdrawAmt;
		this.afterDeposit = afterDeposit;
		this.afterWithdraw = afterWithdraw;
	}
	public float getn1()
	{
		return balance;
	
	}
	public float getn2()
	{
		return withdrawAmt;
	}
	public float getn3()
	{
		return depositAmt;
	}
	public float getn4()
	{
		afterWithdraw = balance-withdrawAmt;
		return afterWithdraw;
	}
	public float getn5()
	{
		afterDeposit = balance+depositAmt;
		return afterDeposit;
	}
	
}

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the balance : ");
		float a = sc.nextFloat();
		System.out.println("Enter Withdrawamount : ");
		float b = sc.nextFloat();
		System.out.println("Enter Depositwamount : ");
		float c = sc.nextFloat();
		AccountClass obj = new AccountClass(a,b,c);
		System.out.println("Balance is: "+obj.getn1());
		System.out.println("Withdrawamt value is :"+obj.getn2());
		System.out.println("depositAmt value is :"+obj.getn3());
		System.out.println("Withdraw value of parametrized constructor is :"+obj.getn4());
		System.out.println("Deposit value of parametrized constructor is :"+obj.getn5());
		AccountClass obj1 = new AccountClass();
		obj1.WithdrawBalance();
		obj1.DepositBalance();

	}

}
