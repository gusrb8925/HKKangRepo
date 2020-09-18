import java.util.Scanner;

public class Ex4344 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt(); // 케이스 수
		double avg = 0;

		for (int i = 0; i < a; i++) {
			int n = s.nextInt(); // 학생 수
			int[] arr = new int[n];
			int count = 0;// 평균 넘는 학생수
			int sum = 0;
			for (int j = 0; j < n; j++) {
				arr[j] = s.nextInt();
				sum += arr[j];
			}
			avg = (double) sum / n;
			for (int j = 0; j < n; j++) {
				if (arr[j] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f", (double) 100 * count / n);
			System.out.println("%");
		}

	}

}
