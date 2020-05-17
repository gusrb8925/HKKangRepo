import java.util.Scanner;

public class Ex1092 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = 1;

		while (d % a != 0 || d % b != 0 || d % c != 0) {
			d++;
		}
		System.out.println(d);
	}

}
