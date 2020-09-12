import java.util.Scanner;

public class Ex3034 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int w = s.nextInt();
		int h = s.nextInt();
		int x = (int) Math.sqrt(w * w + h * h);
		for (int i = 0; i < n; i++) {
			int a = s.nextInt();
			if (a <= w || a <= h || a <= x) {
				System.out.println("DA");
			} else {
				System.out.println("NE");
			}
		}
		s.close();

	}

}
