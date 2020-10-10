import java.util.Scanner;

public class Ex10872 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int fack = 1;
		for (int i = 1; i <= a; i++) {
			fack *= i;
		}
		System.out.println(fack);
	}

}
