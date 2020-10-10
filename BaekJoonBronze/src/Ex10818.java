import java.util.Scanner;

public class Ex10818 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int min = 1000001;
		int max = -1000001;
		for (int i = 0; i < a; i++) {
			int b = s.nextInt();
			if (min > b) {
				min = b;
			}
			if (max < b) {
				max = b;
			}
		}
		System.out.println(min + " " + max);
	}

}
