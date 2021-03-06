import java.util.Scanner;

public class Problem8 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String s = in.next();
		int x = 0;
		boolean res = Check(s, x);
		if(res == true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	private static boolean Check(String s, int x) {
		if(x == s.length() - 1) {
			if(!(s.charAt(x) >= '0' && s.charAt(x) <= '9')) return false;
			else return true;
		}
		if(!(s.charAt(x) >= '0' && s.charAt(x) <= '9')) {
			return false;
		}
		return Check(s, x + 1);
	}
}

