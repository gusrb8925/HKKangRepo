import java.util.Scanner;

public class Ex10995_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			if (i % 2 == 1) {
				System.out.print(" ");
			}
			for (int j = 0; j < num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}