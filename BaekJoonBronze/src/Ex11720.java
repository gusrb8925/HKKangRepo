import java.util.Scanner;

public class Ex11720 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int sum = 0;
		String b = s.next();
		for (int i = 0; i < a; i++) {
			sum += Integer.valueOf(String.valueOf(b.charAt(i)));
		}

		System.out.println(sum);
	}

}
