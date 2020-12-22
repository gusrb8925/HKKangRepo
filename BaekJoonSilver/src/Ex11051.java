import java.util.Scanner;

public class Ex11051 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int[][] arr = new int[a + 1][a + 1];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (i == j || j == 0) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = (arr[i - 1][j - 1] + arr[i - 1][j]) % 10007;
				}
			}
		}
		System.out.println(arr[a][b]);
	}
}