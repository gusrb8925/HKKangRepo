import java.util.Scanner;

public class Ex2884 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int h = s.nextInt();
		int m = s.nextInt();
		s.close();

		m -= 45;
		if (m < 0) {
			if (h != 0) {
				h -= 1;
				m += 60;
			} else {
				h = 23;
				m += 60;
			}
		}
		System.out.println(h + " " + m);
	}

}
