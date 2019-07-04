package SecondBankTellerApp;

import java.math.BigDecimal;

public class BankAccount2 {
	
	private String accountNumber;
	//new bank account balance = 0
	private BigDecimal balance = new BigDecimal(0);
	
	//Constructor
	public BankAccount2(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	//Account Methods
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	// Balance Methods
	public BigDecimal getBalance() {
		return balance;
	}
	private void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
	
	//Moving Money Methods
	public BigDecimal deposit(BigDecimal amountToDeposit) {
		balance = balance.add(amountToDeposit);
		return balance;
	}
	
	public BigDecimal withdraw(BigDecimal amountToWithdraw) {
		balance = balance.subtract(amountToWithdraw);
		return balance;
	}
	
	public void transfer(BankAccount2 destinationAccount, BigDecimal transferAmount) {
		//Subtract the transfer amount and update the balance
		//Setting balance to (balance - transferAmount
		//this.balance.subtract(transferAmount);
		balance = balance.subtract(transferAmount);
		//this.destinationAccount.balance = ...
		destinationAccount.balance = destinationAccount.balance.add(transferAmount);
	}
}


