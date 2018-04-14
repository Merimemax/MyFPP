package assignment4_3employeeinfo;

public class CheckingAccount extends Account {
	private final double MONTHLY_CHARGE = 5.00;

	public CheckingAccount(Employee emp, Double startAmount) {
		super(emp, startAmount);
	}

	public AccountTypes getAcctType() {
		return AccountTypes.CHECKING;
	}

	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		return baseBalance - MONTHLY_CHARGE;

	}
public String toString() {
		
		
		return String.format(" %2s %5s %n %2s $%.2f", 
				"Account type:",this.getAcctType(),"Current bal:",super.getBalance());
	}
}
