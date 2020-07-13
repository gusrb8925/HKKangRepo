import java.util.Arrays;
import java.util.Scanner;

public class Ex2750 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int[] ar = new int[a];
		for (int i = 0; i < a; i++) {
			ar[i] = s.nextInt();
		}
		Arrays.sort(ar);
		for (int i = 0; i < a; i++) {
			System.out.println(ar[i]);
		}

	}

}
