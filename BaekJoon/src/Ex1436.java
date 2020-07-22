import java.util.Scanner;

public class Ex1436 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();

		int count = 0;
		while (n > 0) {
			count++;
			if (String.valueOf(count).contains("666")) {
				n--;
			}
		}
		System.out.println(count);
	}

}
