import java.util.Scanner;

public class ex {

	static boolean isPalindrome(int number) {
		int x = number;
		int y = number;
		int reverseNumber = 0;
		int lastNumber;
		System.out.println("Number: " + x);

		while (x != 0) {
			lastNumber = x % 10;
			reverseNumber = (reverseNumber * 10) + lastNumber;
			x = x / 10;
		}
		System.out.println("REVERSE: " + reverseNumber);
		if (number == reverseNumber) {
			System.out.println(y + " is Palindrome Number.");
			return true;
		} else {
			System.out.println(y + " is not Palindrome Number.");
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		isPalindrome(num);

	}

}
