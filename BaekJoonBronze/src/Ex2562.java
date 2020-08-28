import java.util.*;

public class Ex2562 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] arr = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = s.nextInt();
		}
		s.close();

		int max = arr[0];
		for (int i = 0; i < 9; i++)
			if (max < arr[i]) {
				max = arr[i];
			}

		for (int i = 0; i < 9; i++) {
			if (max == arr[i]) {
				System.out.println(arr[i]);
				System.out.println(i + 1);
			}
		}
	}

}
