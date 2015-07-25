package com.association;

public class SavingAccount extends Account {

	private double interestAmount;

	public double getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(double interestAmount) {
		this.interestAmount = interestAmount;
	}

	@Override
	public String withdraw(double amount) {
		if (getBalance() - amount > 0) {
			return super.withdraw(amount);
		} else {
			return "insufficient balance";
		}

	}
	
	
}
