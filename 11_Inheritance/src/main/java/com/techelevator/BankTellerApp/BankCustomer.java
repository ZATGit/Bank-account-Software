package com.techelevator.BankTellerApp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
	
	private String name;
	private String address;
	private String phoneNumber;
	private List<BankAccount>accounts = new ArrayList<BankAccount>();
	
	
	public BankCustomer (String name, String address, String phoneNumber) {
		this.address = address; 
		this.name = name;
		this.phoneNumber = phoneNumber;

	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<BankAccount> getAccounts() {
		return accounts;
	}
	
	public void addAccount(BankAccount newAccount) {
		accounts.add(newAccount);
	}
	
	public boolean vipCustomer() {
		BigDecimal vip = new BigDecimal(0);
		
		for (BankAccount account : accounts) {
				vip = vip.add(account.getBalance());
		}
		if (vip.compareTo(new BigDecimal(25000))== 0 || vip.compareTo(new BigDecimal(25000)) ==  1) {
			return true;
		}
		return false;
			
		}
	
	
}
