import java.util.Scanner;

public class Ex1098 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int[][] ar = new int[a][b];

		int n = s.nextInt();// ���밹��
		for (int i = 0; i < n; i++) {
			int l = s.nextInt();// ����
			int d = s.nextInt();// ����(0����,1����)
			int x = s.nextInt();// x��ǥ
			int y = s.nextInt();// y��ǥ

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
