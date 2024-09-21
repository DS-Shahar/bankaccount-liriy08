
public class BankAccount {
	private int balance = 0;
	private int minBalance = -5000;
	private String owner;

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public int getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}

	public void setBalance(int balance) {
		if (balance > minBalance) {
			this.balance = balance;
		}
	}

	public BankAccount(int balance, int minBalance, String owner) {
		this.balance = balance;
		this.minBalance = minBalance;
		this.owner = owner;
		/*
		 * אסור לתת לה בפרמטרים יתרה נמוכה מהמינימום
		 * 
		 */

	}
	public String ToString()
	{
		 String x= "Balance of " + owner + ": " + balance;
		 return x;
	}

	public boolean withdraw(int amount) {
		if (balance - amount < minBalance)
			return false;
		balance = balance - amount;
		return true;
	}

	public void deposit(int amount) {
		balance = balance + amount;

	}

	public boolean transfer(BankAccount target, int amount) {
		if (withdraw(amount) == false) {
			return false;
		}

		else {
			
			target.deposit(amount);
			return true;
		}

	}
	
	
	
	

}