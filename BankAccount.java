package week9;

public class BankAccount {
	
	String accountNumber;
	double balance;
	
	
	public BankAccount(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public double deposit(double amount)
	{
		if(amount >= 0)
		{
			balance+=amount;
		}
		else
		{
			System.out.println("Deposit amount cant be negative");
		}
		return balance;
	}
	public double withdraw(double amount)
	{
		if(balance >= amount)
		{
			balance-=amount;
		}
		else
		{
			System.out.println("Insufficient Funds");
		}
		return balance;
	}
	public void getBalance()
	{
		System.out.println("BALANCE: " + balance);
	}
	public void displayAccountInfo()
	{
		System.out.println("ACCOUNT NUMBER: " + accountNumber);
		System.out.println("BALANCE: " + balance);
	}

}
