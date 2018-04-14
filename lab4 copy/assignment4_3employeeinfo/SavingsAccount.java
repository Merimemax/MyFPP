package assignment4_3employeeinfo;

public class SavingsAccount  extends Account {
	private final double INTEREST = 0.25/100;

 public SavingsAccount(Employee emp,Double startAmount) {
	super(emp,startAmount);
	}
	public AccountTypes getAcctType() {
		return AccountTypes.SAVINGS;
	}
	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		double interest = INTEREST*baseBalance;
		return baseBalance + interest;
		}
public String toString() {
				
		return String.format(" %2s %5s %n %2s $%5.2f", 
				"Account type:",this.getAcctType(),"Current bal:",super.getBalance());
	}
}
