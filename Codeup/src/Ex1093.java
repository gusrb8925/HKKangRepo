import java.util.Scanner;

public class Ex1093 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int[] b = new int[23];

		for (int i = 0; i < a; i++) {
			int num = s.nextInt();
			b[num - 1]++;
		}
		for (int j=0; j<b.length;j++) {
			System.out.printf("%d ", b[j]);
		}

	}

}
