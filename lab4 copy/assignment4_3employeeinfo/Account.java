package assignment4_3employeeinfo;

abstract class Account {
	
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	
//	private Employee employee;

	Account(Employee emp, double balance) {
//		this.employee = emp;
		this.balance = balance;
	}

	Account(Employee emp) {
		this(emp, DEFAULT_BALANCE);
	}
	public abstract AccountTypes getAcctType();
	
	
/*	public String toString() {
		return String.format(" %2s %5s %n %2s $%5.2f", 
				"Account type:",acctType,"Current bal:",balance);
	}*/
 
	
    public double getBalance() {
    	return balance;
    }
	
	
	public boolean makeDeposit(double deposit) {
		if(deposit>0) {
		balance+=deposit;
		return true;
		}
		return false;
	}

	public boolean makeWithdrawal(double amount) {
		
		if(amount<=balance)
		{
			balance-=amount;
			return true;
		}
		return false;
	}

	
}
