import java.util.Scanner;

public class Ex10953 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for (int i = 0; i < a; i++) {
			String[] ar = s.next().split(",");
			System.out.println(Integer.valueOf(ar[0]) + Integer.valueOf(ar[1]));
		}
	}

}
