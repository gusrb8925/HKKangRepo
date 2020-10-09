import java.util.Scanner;

public class Ex10569 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for (int i = 0; i < a; i++) {
			int b = s.nextInt();
			int c = s.nextInt();
			int ans = c - b + 2;
			System.out.println(ans);
		}

	}

}
