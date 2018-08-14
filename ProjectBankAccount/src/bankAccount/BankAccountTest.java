package bankAccount;

import java.util.*;

/**
 * Bank Account
 * @author Olejnik
 *
 */

public class BankAccountTest {
	
	public static void main(String[] args)
	{
		Account k = new Account("Wojtek", 1234, 1000);
		k.show();
		k.setBalance(500);
		k.show();
		k.getMoney(200);
		k.show();
		
		AccountDebit k2 = new AccountDebit("Klaudia", 56789, 1000, 1000);
		k2.setBalance(100);
		k2.show();
		k2.getMoney(3000);
		k2.show();
	}

}
