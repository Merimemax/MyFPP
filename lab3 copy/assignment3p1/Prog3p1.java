package assignment3p1;

public class Prog3p1 {
	public static void main(String[] args) {
		
		Employee employeeM = new Employee("Merih", "meri", 120000.00, 2012, 1, 1);
		Account accountMck = new Account(employeeM, AccountType.CHECKING_ACCOUNT, 300);
		Account accountMsa = new Account(employeeM, AccountType.SAVINGS_ACCOUNT, 300);
		Account accountMrt = new Account(employeeM, AccountType.RETIREMENT_ACCOUNT, 300);
		
		System.out.println(employeeM.getName() + " " + accountMck);
		System.out.println(employeeM.getName() + " " +accountMsa);
		System.out.println(employeeM.getName() + " " +accountMrt);
	}
}
