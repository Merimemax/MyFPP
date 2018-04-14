package assignment4_3;

import java.util.Scanner;

import assignment4_3employeeinfo.Employee;

public class Main {
	Employee[] emps = null;

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2, 13);

		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("A. See a report of all accounts. " + "\n" + "B. Make a deposit. " + "\n"
				+ "C. Make a withdrawal." + "\n" + " Make a selection (A/B/C): ");
		String answer = sc.next();
		if (answer.equalsIgnoreCase("a")) {
			String info = getFormattedAccountInfo();
			System.out.println(info);

		} else if (answer.equalsIgnoreCase("b") || answer.equalsIgnoreCase("c")) {
			for (int i = 0; i < emps.length; i++) {
				System.out.println(i + " . " + emps[i].getName());
			}
			System.out.println("Select an employee: (type a number)");
			int emp_index = sc.nextInt();

			System.out.print("0. checking " + "\n" + "1. savings" + "\n" + "2. retirement." + "\n"
					+ " Make a selection (type a number): ");
			int acc_index = sc.nextInt();
			if (answer.equalsIgnoreCase("b")) {
				System.out.println("Deposit amount: ");
				int deposit_amt = sc.nextInt();
				emps[emp_index].deposit(acc_index, deposit_amt);
				System.out.println("Your New Account Report is:" + emps[emp_index].getFormattedAcctInfo());
				
			}
			if (answer.equalsIgnoreCase("c")) {
				System.out.println("Withdraw amount: ");
				int withdraw_amt = sc.nextInt();
				emps[emp_index].withdraw(acc_index, withdraw_amt);
				System.out.println("Your New Account Report is:" + emps[emp_index].getFormattedAcctInfo());
				
			}
			sc.close();
		}

	else 

	{
		// do nothing..the application ends here
		System.out.println("Wrong entry , good bye");
		System.exit(0);
	}
	}

	String getFormattedAccountInfo() {
		String result = "";

		for (int i = 0; i < emps.length; i++) {
			result = result + "\n" + "\n" + emps[i].getFormattedAcctInfo();

		}
		return result;
	}
}
