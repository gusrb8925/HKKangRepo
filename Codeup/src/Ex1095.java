import java.util.Scanner;

public class Ex1095 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int[] ar = new int[a];

		for (int i = 0; i < a; i++) {
			int b = s.nextInt();
			ar[b - 1]++;
		}
		for (int j = 0; j < a; j++) {
			if (ar[j] > 0) {
				System.out.println(j + 1);
				break;
			}
		}

	}

}
