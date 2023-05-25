import java.util.*;
public class fibo {                                    //1,1,2,3,5,8,13,21,34,55... fibonacci(1)=1 fibo(2)=1 
	
	public static int fibonacci(int x) {            //fibo(3)=fibo(2)+fibo(1)=2          fibo(4)=fibo(3)+fibo(2)=3
		int result =1;                             //fibo(6)=fibo(5)+fibo(4)=8
		if(x==1 || x==2) {                        //fibonacci(n)= fibonacci(n-1)+fibonacci(n-2)
			return 1;
		}
		else {
			result= fibonacci(x-1)+fibonacci(x-2);
			return result;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num= scan.nextInt();
		System.out.println("Result: "+fibonacci(num));

	}

}
