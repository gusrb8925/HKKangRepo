import java.util.Scanner;

public class Ex1099 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] ar = new int[10][10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				ar[i][j] = s.nextInt();
			}
		}
		int x = 1;
		int y = 1;
		int end = 0;

		for (int i = x; i < 10; i++) {
			if (end != 1) {
				for (int j = y; j < 10; j++) {
					if (ar[i][j] == 0) {
						ar[i][j] = 9;
						y++;
					} else if (ar[i][j] == 1) {
						y--;
						x++;
						break;
					} else if (ar[i][j] == 2) {
						ar[i][j] = 9;
						end = 1;
						break;
					}
				}

			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

	}
}