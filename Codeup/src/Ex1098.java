import java.util.Scanner;

public class Ex1098 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int[][] ar = new int[a][b];

		int n = s.nextInt();// ¸·´ë°¹¼ö
		for (int i = 0; i < n; i++) {
			int l = s.nextInt();// ±æÀÌ
			int d = s.nextInt();// ¹æÇâ(0°¡·Î,1¼¼·Î)
			int x = s.nextInt();// xÁÂÇ¥
			int y = s.nextInt();// yÁÂÇ¥

			if (d == 0) {
				for (int q = 0; q < l; q++) {
					ar[x - 1][y - 1 + q] = 1;
				}
			} else {
				for (int k = 0; k < l; k++) {
					ar[x - 1 + k][y - 1] = 1;
				}
			}
		}

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

	}

}
