import java.util.Scanner;

public class Ex1095_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] a = new int[23];
		int b = s.nextInt();

		for (int i = 0; i < b; i++) {
			int num = s.nextInt();
			a[num - 1]++;
		}
		for (int j = 0; j < 23; j++) {
			if (a[j] > 0) {
				System.out.println(j + 1);
				break;
			}
		}

	}

}