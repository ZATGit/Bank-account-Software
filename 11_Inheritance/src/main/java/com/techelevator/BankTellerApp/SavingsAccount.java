package com.techelevator.BankTellerApp;

import java.math.BigDecimal;

public class SavingsAccount extends BankAccount{
	
	public SavingsAccount(String accountNumber) {
		super(accountNumber);
	}
	
	@Override
	public BigDecimal withdraw(BigDecimal amountToSubtract) {
		
		
		if(getBalance().compareTo(new BigDecimal(150)) == -1) {
			super.withdraw(amountToSubtract);
			super.withdraw(new BigDecimal(2));
			return super.getBalance();
			
		}
		
		if(getBalance().compareTo(amountToSubtract) == -1) {
			
			return super.getBalance();
			
		}
			
		super.withdraw(amountToSubtract);
		return getBalance();
		
		
	  }
	
}
