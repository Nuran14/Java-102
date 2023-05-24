
public class MultiplicationException extends Exception {

	@Override
	public void printStackTrace() {
		System.out.println("both numbers must be less than 10,000");
	}
	
	

}
