import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++) {
			array[i] = in.nextInt();
		}
		
		System.out.println(getAverage(array, n));
	}
	
	public static double getAverage(int[] array, int n) {
		double generalVal = 0;
		for(int i = 0; i < n; i++) {
			generalVal += array[i];
		}
		return generalVal / 4;
	}
}

