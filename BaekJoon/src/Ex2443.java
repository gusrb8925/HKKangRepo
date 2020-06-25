import java.util.Scanner;

public class Ex2443 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for (int i = 0; i < a; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = a * 2 - 1; j > i * 2; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}