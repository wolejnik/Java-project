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
		
		/*
		 * salary :)
		 */
		
		Account[] bank = new Account[3];
		bank[0] = new Account("Jan", 1010, 800);
		bank[1] = new Account("Tomek", 1111, 900);
		bank[2] = new Account("Ola", 2222, 700);
		
		for(Account a : bank)
		{
			a.show();
		}
	}

}
