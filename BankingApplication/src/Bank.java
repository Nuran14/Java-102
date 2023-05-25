import java.util.Scanner;
public class Bank {
	public static void main(String[] args) {
	CheckingAccount account = new CheckingAccount();
	Scanner scan = new Scanner(System.in);
	System.out.println("Account is created. Do you want to deposit initial money?");
	account.setBalance(scan.nextDouble());
	System.out.println();
	System.out.println("You deposit $"+account.getBalance());
	boolean a= true;
	int balance;
	
	while(a) {
		System.out.println("Do you want to deposit or withdraw money? D or W");
        System.out.println("(E for exit)");
        String selection = scan.next();
	    switch(selection) {
     	case "D":
     		System.out.println("Please enter the amount: ");
     		double amount= scan.nextInt();
		    System.out.println();
		    System.out.println("You deposit $"+amount);
		    account.deposit(amount);
		    break;
	    case "W":
		try {
			System.out.println("Please enter the amount: ");
		    amount= scan.nextInt();
			account.withdraw(amount);
			System.out.println("You withdraw $"+amount);
		}
		catch(InsufficientFundsException e) {
			System.out.println("Sorry, but you are short $"+e.getAmount());
			e.printStackTrace();
			a=false;
		}
		break;
	    case "E":
	    a=false;
		break;
		
	    default:
	    	System.out.println("Please enter D, W or E");
	    	break;
	}
	   
	    	
	}
	System.out.println("You are exiting. The current amount is $"+account.getBalance());
}}
