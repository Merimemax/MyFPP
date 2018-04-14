package assignment3p2;

import java.time.LocalDate;
import java.util.GregorianCalendar;

import assignment3p1.Account;
import assignment3p1.AccountType;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;
	assignment3p1.Employee emp;

	@SuppressWarnings("static-access")
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		GregorianCalendar cal = new GregorianCalendar(yearOfHire, monthOfHire - 1, dayOfHire);
		hireDate = LocalDate.of(cal.YEAR, 1 + cal.MONTH, cal.DATE);
		emp = new assignment3p1.Employee(name, name, 0.00, yearOfHire, monthOfHire, dayOfHire);
	}

	public void createNewChecking(double startAmount) {
		checkingAcct = new Account(emp, AccountType.CHECKING_ACCOUNT, startAmount);
	}

	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(emp, AccountType.SAVINGS_ACCOUNT, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(emp, AccountType.RETIREMENT_ACCOUNT, startAmount);
	}

	public String getFormattedAcctInfo() {
		System.out.println();
		String result ="";
		if (name != null && hireDate != null)
			result = String.format("Name: %s --- Hire Day %5tD\n", name, hireDate);
		if (savingsAcct != null)
			result += String.format("	Money on Saving Account: %-5.2f\n", savingsAcct.getBalance());
		if (checkingAcct != null)
			result += String.format("	checking Account: %-5.2f\n", checkingAcct.getBalance());
		if (retirementAcct != null)
			result += String.format("	retirement Account: %-5.2f", retirementAcct.getBalance());

		return result + "\n\n";
	}

	public void deposit(String acctType, double amt) {
	}

	public boolean withdraw(String acctType, double amt) {
		return false;
	}
}
