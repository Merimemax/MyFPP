package assignment12_2_employee_info;

public class RetirementAccount extends Account {
	private final double PENALTY_PERCENT = 2.0;

	RetirementAccount(Employee e, double startBalance) {
		super(e, startBalance);
	}

	RetirementAccount(Employee e) {
		super(e);
	}

	public void makeWithdrawal(double amount) throws OverdrawnAccountException {
		double bal = getBalance();

		double penalty = bal * (PENALTY_PERCENT / 100);
		bal = bal - amount - penalty;
		if (bal < 0) {
			throw new OverdrawnAccountException(
					"After computing penalties, your withdrawal amount exceeds your balance.");
		}
		setBalance(bal);
	}

	public AccountType getAcctType() {
		return AccountType.RETIREMENT;
	}

}
