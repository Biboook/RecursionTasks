import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		checkPrime(n);
	}
	
	public static void checkPrime(int n) {
		boolean checkPrime = false;
		
		for(int i = 2; i < n; i++) {
			if (n % i == 0) {
				checkPrime = true;
				break;
			} else {
				checkPrime = false;
			}
		}
		if(checkPrime == false) {
			System.out.println("Prime");
		} else {
			System.out.println("Composite");
		}
	}
}
