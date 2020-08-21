import java.util.Scanner;

public class Ex1929_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		s.close();

		int[] ar = new int[b + 1];

		for (int i = 0; i < b + 1; i++) {
			ar[i] = 0;
		}
		ar[1] = 1;
		for (int i = 2; i <= b; i++) {
			for (int j = 2; i * j <= b; j++) {
				ar[i * j] = 1;
			}
		}
		for (int i = a; i <= b; i++) {
			if (ar[i] != 1) {
				System.out.println(i);
			}
		}
	}
}