import java.util.Scanner;

public class Ex2581 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		s.close();

		int min = 10001;
		int hap = 0;
		int[] ar = new int[b + 1];

		for (int i = 0; i < b + 1; i++) {
			ar[i] = 0;
		}
		ar[1] = 1;
		for (int i = 2; i < b + 1; i++) {
			for (int j = 2; i * j <= b; j++) {
				ar[i * j] = 1;
			}
		}
		for (int i = a; i <= b; i++) {
			if (ar[i] != 1) {
				hap += i;
				if (i < min) {
					min = i;
				}
			}
		}
		if (min == 10001) {
			System.out.println("-1");

		} else {
			System.out.println(hap);
			System.out.println(min);
		}
	}

}
