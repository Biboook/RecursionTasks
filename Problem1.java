import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++) {
			array[i] = in.nextInt();
		}
		
		System.out.println(FindMinimum(array, n));
	}
	
	public static int FindMinimum(int[] array, int n) {
		int minVal = array[0];
		for(int i = 1; i < n; i++) {
			if(array[i] < minVal) {
				minVal = array[i];
			}
		}
		return minVal;
	}
}

