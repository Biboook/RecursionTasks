import java.util.Scanner;

public class Problem7 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		Reverse(n);
	}
	
	public static void Reverse(int n) {
		if(n == 0) return;
		int x = in.nextInt();
		Reverse(n - 1);
		System.out.print(x + " ");	
	}
}

