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
	public AccountDebit(String n, double nrAccount, double b, double limit)
	{
		super(n, nrAccount, b);
		this.limitDebit = limit;
		this.debit = 0;
		
	}
	
	public void show()
	{
		super.show();
		System.out.pr
	}
}
