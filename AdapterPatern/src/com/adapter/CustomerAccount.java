package com.adapter;

import java.util.Scanner;

public class CustomerAccount extends Account implements CreaditCard {
	Scanner input = new Scanner(System.in);

	@Override
	public void setAccount() {
		System.out.println("Enter your Acc No :");
		String acNo = input.next();
		System.out.println("Enter your balance :");
		double balance = input.nextDouble();
		System.out.println("Entr your branch name :");
		String branchName = input.next();

		setAccNo(acNo);
		setBalance(balance);
		setBranchName(branchName);
	}

	@Override
	public String getDetails() {

		return "Your Account No : " + getAccNo() + "  Balance :" + getBalance()
				+ "  Branch Name :" + getBranchName();
	}

}
