import java.util.Scanner;

public class Ex5565 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = 10;
		int price = s.nextInt();
		for (int i = 1; i < n; i++) {
			price -= s.nextInt();
		}
		System.out.println(price);
		s.close();

	}

}
