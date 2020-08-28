import java.util.Scanner;

public class Ex2566 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] arr = new int[9][9];
		int max = 0;
		int row = 0;
		int col = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = s.nextInt();
				if (arr[i][j] > max) {
					max = arr[i][j];
					row = i + 1;
					col = j + 1;
				}
			}
		}
		s.close();
		System.out.println(max);
		System.out.println(row + " " + col);
	}

}
