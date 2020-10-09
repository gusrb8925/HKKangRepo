import java.util.Scanner;

public class Ex8958 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();

		for (int i = 0; i < a; i++) {
			String str = s.next();
			int count = 0;
			int sum = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == 'O') {
					sum += ++count;
				} else {
					count = 0;
				}
			}
			System.out.println(sum);
		}
	}

}
