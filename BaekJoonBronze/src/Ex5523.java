import java.util.Scanner;

public class Ex5523 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int aw = 0;
		int bw = 0;
		for (int i = 0; i < n; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			if (a > b) {
				aw++;
			} else if (a < b) {
				bw++;
			}
		}
		s.close();
		System.out.println(aw + " " + bw);

	}

}
