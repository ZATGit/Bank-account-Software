package SecondBankTellerApp; 

import java.math.BigDecimal;

public class CheckingAccount2 extends BankAccount2 {
	//private BigDecimal overdraftFee;
	//private BigDecimal balanceFeeThreshold;
	
	// Constructor - not done
	public CheckingAccount2 (String accountNumber) {
		super(accountNumber);
	}
	
	// Override Methods
	
	@Override
	public BigDecimal withdraw(BigDecimal amountToWithdraw) {
		super.withdraw(amountToWithdraw);
		
		if (getBalance().compareTo(new BigDecimal(-100)) == -1) {
			
			return super.getBalance().add(amountToWithdraw);
		}
	
	
	if(getBalance().compareTo(new BigDecimal(0)) == -1) {
		return super.withdraw(new BigDecimal(10));
	}
		return getBalance();
		
	//public BigDecimal getOverdraftFee() {
		//return overdraftFee;
	//}
	
	//public BigDecimal setOverdraftFee() {
	//	this.overdraftFee = 10.00; 
	//}
	
	//public BigDecimal balanceFeeThreshold() {
	//	return balanceFeeThreshold;
//}
	
//	public BigDecimal setBalancethreshold() {
//		this.balanceFeeThreshold = 0.00;
//	} 
	}
}