package com.techelevator.BankTellerApp;

import java.math.BigDecimal;

public class BankAccount {
	
	private String accountNumber;
	private BigDecimal balance = new BigDecimal(0);
	
	public BankAccount(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getBalance() {
		return balance;
	}
	
//	public BigDecimal getFee() {
//		return balance.subtract(new BigDecimal(0));
//	}
	
	public BigDecimal deposit(BigDecimal amountToDeposit) {	
		balance = balance.add(amountToDeposit);
		return balance;
	}
	
	public BigDecimal withdraw(BigDecimal amountToSubtract) {
		balance = balance.subtract(amountToSubtract);
		return balance;
	}
	
	public void transfer(BankAccount destinationAccount, BigDecimal transferAmount) {
		destinationAccount.balance = destinationAccount.balance.add(transferAmount); 
		this.balance = this.balance.subtract(transferAmount);
	}
	
}
