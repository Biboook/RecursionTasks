import java.util.Scanner;

public class Problem6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int n = in.nextInt();
		
		System.out.println(Power(a, n));
	}
	
	public static int Power(int a, int n) {
		if(n == 1) return a;
		return a * Power(a, n - 1);
	}
}
