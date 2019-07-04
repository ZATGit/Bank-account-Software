package com.techelevator.BankTellerApp;

import java.math.BigDecimal;

public class CheckingAccount extends BankAccount{
	
	
	
	public CheckingAccount(String accountNumber) {
		super(accountNumber);
	}
	
	@Override
	public BigDecimal withdraw(BigDecimal amountToSubtract) {
		super.withdraw(amountToSubtract);
		
		if(getBalance().compareTo(new BigDecimal(-100)) == -1) {
			
			return super.getBalance().add(amountToSubtract);
			
		}
		
		if(getBalance().compareTo(new BigDecimal(0)) == -1) {
			//super.balance = super.balance.subtract(amountToSubtract);
			//super.withdraw(amountToSubtract);
			return super.withdraw(new BigDecimal(10));
			//return getBalance().subtract(new BigDecimal(10));
		}
			
			return getBalance();
		
		
	  }
	
	
}
