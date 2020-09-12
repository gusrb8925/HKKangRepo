import java.util.Scanner;

public class Ex3009 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] x = new int[3];
		int[] y = new int[3];
		int dx, dy;

		for (int i = 0; i < 3; i++) {
			x[i] = s.nextInt();
			y[i] = s.nextInt();
		}

		if (x[1] == x[2]) {
			dx = x[0];
		} else {
			dx = x[0] == x[1] ? x[2] : x[1];
		}

		if (y[1] == y[2]) {
			dy = y[0];
		} else {
			dy = y[0] == y[1] ? y[2] : y[1];
		}
		s.close();
		System.out.println(dx + " " + dy);

	}
}