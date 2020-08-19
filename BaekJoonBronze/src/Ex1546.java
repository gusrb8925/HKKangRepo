import java.util.Scanner;

public class Ex1546 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();

		float sum = 0;
		float[] ar = new float[n];
		for (int i = 0; i < n; i++) {
			ar[i] = s.nextInt();
		}
		float max = 0;
		for (int i = 0; i < n; i++)
			if (ar[i] > max) {
				max = ar[i];
			}

		for (int i = 0; i < n; i++) {
			ar[i] = ar[i] / max * 100;
			sum += ar[i];
		}
		System.out.println(sum / n);
	}

}
