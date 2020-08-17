import java.util.Scanner;

public class Ex1085 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		int w = s.nextInt();
		int h = s.nextInt();
		s.close();

		System.out.println(Math.min(Math.min(w - x, x), Math.min(h - y, y)));
	}

}
