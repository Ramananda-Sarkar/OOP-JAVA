package com.association;

import java.util.ArrayList;

public class Startup {
	public static void main(String[] args) {
		Account ac1 = new Account();
		ac1.setName("MD.XYZ");
		ac1.setAcNumber("38999043-499");
		ac1.setBalance(5000);
		ac1.deposite(5000);
		System.out.println(ac1.getBalance());

		SavingAccount sv1 = new SavingAccount();
		sv1.setName("Pupus");
		sv1.setAcNumber("4530-503");
		sv1.setInterestAmount(2000);
		sv1.deposite(5000);
		System.out.println(sv1.withdraw(5000));
		System.out.println(sv1.getBalance());

		CheckingAccount chk1 = new CheckingAccount();
		chk1.setName("chk-12");
		chk1.setAcNumber("9088-988");
		chk1.deposite(4000);
		System.out.println(chk1.getBalance());

		ArrayList<Account> accountList = new ArrayList<Account>();
		;
		accountList.add(ac1);
		accountList.add(sv1);
		accountList.add(chk1);

		for (Account anAcount : accountList) {
			anAcount.withdraw(5000);
		}
		System.out.println("Main Account :" + ac1.getBalance());
		System.out.println("saving account " + sv1.getBalance());
		System.out.println("checking account " + chk1.getBalance());

		SavingAccount svc1 = new SavingAccount();
		svc1.setInterestAmount(2300);

		Account acc11 = svc1;
		Account acc22 = new CheckingAccount();
		Account acc33 = new Account();

		SavingAccount sv11 = (SavingAccount) acc11;
		System.out.println(sv11.getInterestAmount());

	}

}
