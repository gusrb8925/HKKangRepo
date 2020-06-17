import java.util.Scanner;

public class Ex1094 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int len = 64;
		int x = s.nextInt();
		int count = 0;
		while (x > 0) {
			if (len > x) {
				len /= 2;
			} else {
				count++;
				x -= len;
			}
		}
		System.out.println(count);
	}

}
