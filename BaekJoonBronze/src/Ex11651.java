import java.util.Arrays;
import java.util.Scanner;

public class Ex11651 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int[] aa = new int[a];
		int[] bb = new int[a];
		for (int i = 0; i < a; i++) {
			int b = s.nextInt();
			int c = s.nextInt();
			aa[i] = b;
			bb[i] = c;
		}
		Arrays.sort(aa);
		Arrays.sort(bb);
		for (int i = 0; i < a; i++) {
			System.out.println();
		}

	}

}
