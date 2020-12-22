import java.util.Scanner;

public class Ex11653 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int i = 2;
		while (a >= i) {
			if (a % i == 0) {
				System.out.println(i);
				a /= i;
			} else {
				i++;
			}
		}
		s.close();

	}

}
