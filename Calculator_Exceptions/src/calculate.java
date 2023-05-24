import java.util.*;

public class calculate {
	public static void main(String[] args) {

		Scanner number = new Scanner(System.in);

		System.out.println("SELECT SİGN");
		System.out.println("1)Addition");
		System.out.println("2)Extraction process");
		System.out.println("3)Multiplication");
		System.out.println("4)Division");
		int selection = number.nextInt();

		try {
			switch (selection) {
			case 1:
				System.out.print("Enter a Number: ");
				double num1 = number.nextDouble();
				System.out.print("Enter a other number: ");
				double num2 = number.nextDouble();
				System.out.println("The result of the addition operation: " + (num1 + num2));
				break;
			case 2:
				System.out.print("Enter a Number: ");
				num1 = number.nextDouble();
				System.out.print("Enter a other number: ");
				num2 = number.nextDouble();
				System.out.println("Result of subtraction: " + (num1 - num2));
				break;
			case 3:
				System.out.print("Enter a Number: ");
				num1 = number.nextDouble();
				System.out.print("Enter a other number: ");
				num2 = number.nextDouble();
				if (num1 > 10000 && num2 > 10000) {
					throw new MultiplicationException();
				}
				System.out.println("The result of the multiplication: " + (num1 * num2));
				break;
			case 4:
				System.out.println("Enter a Number: ");
				num1 = number.nextDouble();
				System.out.print("Enter a other number: ");
				num2 = number.nextDouble();
				System.out.println("The result of the division operation: " + (num1 / num2));
				break;
			default:
				System.out.println("Invalid selection.");
				break;
			}
		} catch (ArithmeticException e) {
			System.out.println("A number cannot be divided by zero");
		} catch (InputMismatchException e) {
			System.out.println("Please enter the inputs in the correct format...");
		} catch (MultiplicationException e) {
			e.printStackTrace();
		}

	}
}
