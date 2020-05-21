import java.util.Scanner;

public class Ex1097 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] ar = new int[19][19];

		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				ar[i][j] = s.nextInt();// 바둑판입력받기
			}
		}

		int a = s.nextInt();// 뒤집기 횟수입력받기
		for (int i = 0; i < a; i++) {
			int x = s.nextInt();
			int y = s.nextInt();

			for (int q = 0; q < 19; q++) {
				if (ar[q][x - 1] == 0) {
					ar[q][x - 1] = 1;
				} else
					ar[q][x - 1] = 0;
			}
			for (int w = 0; w < 19; w++) {
				if (ar[y - 1][w] == 0) {
					ar[y - 1][w] = 1;
				} else
					ar[y - 1][w] = 0;
			}
		}

		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				System.out.printf(ar[i][j] + " ");
			}
			System.out.println();
		}

	}

}
