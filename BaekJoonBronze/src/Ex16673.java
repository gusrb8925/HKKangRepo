import java.util.Scanner;

public class Ex16673 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int c = s.nextInt();
		int k = s.nextInt();
		int p = s.nextInt();
		int result = 0;
		for (int i = 1; i <= c; i++) {
			result += i * k + p * i * i;
		}
		s.close();
		System.out.println(result);

	}

}
