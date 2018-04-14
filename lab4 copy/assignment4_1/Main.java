package assignment4_1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Professor dOne = new Professor("Dr Number_One", LocalDate.of(2012, 2, 4), 80000);
		Professor dTwo = new Professor("Dr Number_two", LocalDate.of(2012, 2, 4), 70000);
		Professor dThree = new Professor("Dr Number_three", LocalDate.of(2012, 2, 4), 60000);

		Secretary sOne = new Secretary("SecNumber_one", LocalDate.of(2012, 2, 4), 3000);
		Secretary sTwo = new Secretary("SecNumber_two", LocalDate.of(2012, 2, 4), 2000);

		dOne.setNumberOfPublications(10);
		dTwo.setNumberOfPublications(10);
		dThree.setNumberOfPublications(10);

		sOne.setOvertimeHours(200);
		sTwo.setOvertimeHours(200);

		DeptEmployee[] department = new DeptEmployee[5];

		department[0] = dOne;
		department[1] = dTwo;
		department[2] = dThree;
		department[3] = sOne;
		department[4] = sTwo;

		Scanner scan = new Scanner(System.in);
		System.out.println("Do you want to see the sum of all salaries in the department.");
		String answer = scan.nextLine();
		double sum = 0;
		if (answer.equals("y") || answer.equals("Y")) {

			for (DeptEmployee dpt : department) {
				System.out.printf("%10s %-15s gets %7.2f\n",dpt.getClass().getSimpleName() ,dpt.getName(),  dpt.computeSalary());
				sum += dpt.computeSalary();
			}

			System.out.printf("\nTotal sum of all department salaries is $%.2f ", sum);

		} else {
			System.out.println("Thank you! Good bye!!");
		}
		scan.close();
	}

}
