import java.util.Scanner;

public class Ex2506 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			int a = s.nextInt();
			if (a == 1) {
				cnt++;
				sum += cnt;
			} else {
				cnt = 0;
			}
		}
		System.out.println(sum);
		s.close();

	}

}
