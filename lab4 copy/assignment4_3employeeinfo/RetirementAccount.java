package assignment4_3employeeinfo;

public class RetirementAccount extends Account{
	private final double PENALITY = 0.2/100;
	
	public RetirementAccount(Employee emp,Double startAmount) {
	super(emp,startAmount);
	}
	public AccountTypes getAcctType() {
		return AccountTypes.RETIREMENT;
	}
	
	
	@Override
public boolean makeWithdrawal(double amount) {
		double baseBalance=super.getBalance();
		if(amount<=baseBalance)
		{
			super.makeWithdrawal(amount+amount*PENALITY);
			return true;
		}
		return false;
	}
public String toString() {
		
		
		return String.format(" %2s %5s %n %2s $%5.2f", 
				"Account type:",this.getAcctType(),"Current bal:",super.getBalance());
	}

}
