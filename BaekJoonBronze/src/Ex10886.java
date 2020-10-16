import java.util.Scanner;

public class Ex10886 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int cute = 0;
		int not = 0;
		for (int i = 0; i < a; i++) {
			int b = s.nextInt();
			if (b == 1) {
				cute++;
			} else if (b == 0) {
				not++;
			}
		}
		if (cute > not) {
			System.out.println("Junhee is cute!");
		} else if (cute < not) {
			System.out.println("Junhee is not cute!");
		}

	}

}
