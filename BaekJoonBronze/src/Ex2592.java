import java.util.Scanner;

public class Ex2592 {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[1001];
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			int a = s.nextInt();
			sum += a;
			arr[a]++;
		}
		int max = 0;
		int maxIndex = 0;
		for (int i = 0; i < 1001; i++) {
			if (max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		s.close();
		System.out.println(sum / 10);
		System.out.println(maxIndex);

	}
	
}