package week9;

public class BankAccountMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		BankAccount myAccount = new BankAccount("623-298-6109", 1000.0);
		
		myAccount.displayAccountInfo();
		myAccount.deposit(500.0);
		myAccount.withdraw(200.0);
		myAccount.getBalance();

	}

}
