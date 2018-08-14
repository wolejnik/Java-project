package bankAccount;

public class AccountDebit extends Account{

	private double limitDebit;
	private double debit;
	
	/**
	 * create bank account with debit
	 * @param n name owner
	 * @param nrAccount numer account
	 * @param b start bakance
	 * @param limit limit debit
	 * @param d debit
	 */
	public AccountDebit(String n, long nrAccount, double b, double limit)
	{
		super(n, nrAccount, b);
		this.limitDebit = limit;
		this.debit = 0;
		
	}
	
	public void show()
	{
		super.show();
		System.out.println("Limit debit : " + limitDebit + "zl\nDebit : " + debit + "zl");
	}
	
	@Override
	public boolean getMoney(double money)
	{
		if (money < 0)
			throw new IllegalArgumentException("Amount can't be negative");
		if (money <= balance)
		{
			return super.getMoney(money);
		}
		else
		{
			double difference = money - balance;
			if(difference + debit <= limitDebit)
			{
				super.getMoney(getBalance());
				debit += difference;
				return true;
			}
			else
			{
				System.out.println("Too large money on account");
			}
		}
		return false;
	}
}
