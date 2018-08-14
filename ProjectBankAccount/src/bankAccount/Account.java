package bankAccount;

public class Account {
	
	private String name;
	private long numberAccount;
	protected double balance;
	
	/**
	 * create bank account 
	 * @param n name owner
	 * @param nrAccount numer account
	 * @param b start bakance
	 */
	public Account(String n, long nrAccount, double b)
	{
		this.name = n;
		this.numberAccount = nrAccount;
		this.balance = b;
	}
	
	public void show()
	{
		System.out.println("User name : " + name + 
				"\nNumber Account : " + numberAccount + 
				"\nBalance : " + balance + "zl");
	}
	
	@Override
	public String toString()
	{
		return "User name : " + name + 
				"\n Number Account : " + numberAccount + 
				"\n Balance : " + balance;
		
	}
	
	/**
	 * money transfer
	 * @param money amount
	 */
	public void setBalance(double money)
	{
		if (money < 0)
			throw new IllegalArgumentException("Amount can't be negative");
		
		this.balance += money;
	}
	
	/**
	 * 
	 * @return balance
	 */
	public double getBalance() 
	{
		return this.balance;
	}
	
	/**
	 * 
	 * @param money
	 * @return true if is positive or false if is negative
	 */
	public boolean getMoney(double money)
	{
		if (money < 0)
			throw new IllegalArgumentException("Amount can't be negative");
		if (money <= balance)
		{
			balance -= money;
			return true;
		}
		System.out.println("Too little money on account");
		return false;
	}
}
