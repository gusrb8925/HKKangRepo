import java.util.Scanner;

public class Ex1057 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int count = 0;

		while (b != c) {
			b = (b + 1) / 2;
			c = (c + 1) / 2;
			count++;
		}
		System.out.println(count);
	}

}
