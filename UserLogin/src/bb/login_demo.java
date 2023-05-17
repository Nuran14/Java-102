package bb;
import java.util.Scanner;
public class login_demo {

	public static void main(String[] args) {
		int rightEntry =3;
	login ab = new login("nuran.er","123");
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the username: ");
	String userName = scan.next();
	System.out.print("Enter the password: ");
	String passwowrd = scan.next();
	rightEntry--;
	boolean a= true;
	
	
	 while(rightEntry>0 && a) {
		 if(userName.equalsIgnoreCase(ab.userName)&& passwowrd.equalsIgnoreCase(ab.password)) {
			 System.out.println("---WELCOME---");
			 break;
		 }
		 else {
			 System.out.println("Username or password is wrong! Would you like to try again?");
			 String b = "1-YES \n2-NO";
			 System.out.println(b);
			 System.out.print("Make Your Choice: ");
			 int choice = scan.nextInt();
			 switch(choice) {
			 case 1:
				 rightEntry--;
				 System.out.print("Enter the username: ");
				 userName = scan.next();
				System.out.print("Enter the password: ");
				 passwowrd = scan.next( );
				 break;
			 case 2:
				 System.out.println("Exiting the Application...");
				 a=false;
				 break;
				 
			default:
				System.out.println("Please login valid!");
				 System.out.println(b);
				 System.out.print("Make a choice again: ");
				 choice = scan.nextInt();
				 if(choice==1) {
					 System.out.print("Enter the username: ");
					 userName = scan.next();
					System.out.print("Enter the password: ");
					 passwowrd = scan.next(); 
					 rightEntry--;}
				 else if(choice==2) {
					 System.out.println("Exiting the Application...");
					 a=false;
				 }
				 else {System.out.println("Please login valid");
				 System.out.println(b);
				 System.out.print("Make a choice again: ");
				 choice = scan.nextInt();
					 
				 }
				
			 }
			    
			 
		 }
	 }
	 if(rightEntry==0) {
		 System.out.println("Your login has expired and your access to your account has been blocked.");
	 }
	}

}
