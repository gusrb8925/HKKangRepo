import java.util.Scanner;

public class Ex1078 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int hap = 0;
		for (int b = 0; b <= a; b++) {
			if (b % 2 == 0) {
				hap = hap + b;
			}
		}
		System.out.println(hap);

	}

}
