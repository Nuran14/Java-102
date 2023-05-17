import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scan.next();
		System.out.print("Enter your salary: ");
		double salary= scan.nextDouble();
		System.out.print("Enter how many hours you worked:");
		double hours= scan.nextDouble();
		System.out.print("What year did you get the job?");
		int year=scan.nextInt();
		
		employee employee1 = new employee(name,salary,hours,year);
		employee1.tax(salary);
		employee1.bonus(hours);
		employee1.raiseSalary(year);
		System.out.println(employee1.toString());
		

	}

}
