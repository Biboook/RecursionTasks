import java.util.Scanner;

public class Problem10 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println(GCD(a, b));
		
	}

	private static int GCD(int a, int b) {
		if(a == 0 || b == 0) return a + b;
		else if(a > b) {
			return GCD(a % b, b);
		} else {
			return GCD(b % a, a);
		}
	}
}


