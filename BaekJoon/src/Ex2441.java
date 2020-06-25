import java.util.Scanner;

public class Ex2441 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				if (i > j) {
					System.out.print(" ");
				} else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
