
public class CheckingAccount {
	private double balance;
	
	public CheckingAccount() {
		this.balance=0;
	}
	
	public void deposit(double amount) {
		balance+=amount;
	}
	public void withdraw(double amount) throws InsufficientFundsException{
		if(amount<= balance) {
			balance-=amount;
		}
		else {
			
			
			
			
			
			
			
			
			
			
			
			
			throw new InsufficientFundsException( amount-balance);
			
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	

}
