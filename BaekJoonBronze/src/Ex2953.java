import java.util.Scanner;

public class Ex2953 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] arr = new int[5][4];
		int max = 0;
		int index = 0;
		for (int i = 0; i < 5; i++) {
			int sum = 0;
			for (int j = 0; j < 4; j++) {
				arr[i][j] = s.nextInt();
				sum += arr[i][j];
			}
			if (sum > max) {
				max = sum;
				index = i + 1;
			}
		}
		System.out.println(index + " " + max);
		s.close();

	}

}
