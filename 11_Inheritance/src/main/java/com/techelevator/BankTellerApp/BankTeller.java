package com.techelevator.BankTellerApp;

import java.math.BigDecimal;

public class BankTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount checking = new CheckingAccount("PDJAK56");
		System.out.println(checking.getAccountNumber());
		SavingsAccount savings = new SavingsAccount("hdhdj");
		
//		System.out.println(checking.withdraw(new BigDecimal(20)));
//		System.out.println(checking.withdraw(new BigDecimal(20)));
//		System.out.println(checking.withdraw(new BigDecimal(90)));
		
		savings.deposit(new BigDecimal(200));
		
		System.out.println(savings.withdraw(new BigDecimal(30)));
		System.out.println(savings.withdraw(new BigDecimal(30)));
		System.out.println(savings.withdraw(new BigDecimal(30)));
		
		BankCustomer Zach = new BankCustomer("Zach", "133333", "4445556666");
		BankCustomer John = new BankCustomer("John", "423323", "3437857403");
		
		CheckingAccount checkingJohn = new CheckingAccount("KLH655");
		
		Zach.addAccount(checking);
		
		John.addAccount(savings);
		
		checkingJohn.deposit(new BigDecimal(200000));
		John.addAccount(checkingJohn);
		
		for(BankAccount account: Zach.getAccounts()) {
			
			System.out.println(account.getAccountNumber());
		
		}
		
		for(BankAccount account: John.getAccounts()) {
			
			System.out.println(account.getAccountNumber());
		}

		System.out.println(Zach.getPhoneNumber());
		System.out.println(Zach.getAddress());
		System.out.println(Zach.getName());
		
		System.out.println(" ========== ");
		System.out.println(John.getPhoneNumber());
		System.out.println(John.getAddress());
		System.out.println(John.getName());
		System.out.println(John.vipCustomer()); 
		
		
}
}
