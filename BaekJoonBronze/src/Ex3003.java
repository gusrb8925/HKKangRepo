import java.util.Scanner;

public class Ex3003 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = { 1, 1, 2, 2, 2, 8 };

		for (int i = 0; i < 6; i++) {
			arr[i] -= s.nextInt();
			System.out.print(arr[i] + " ");
		}

	}

}
