import java.util.Scanner;

public class Ex10809 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(str.indexOf(i) + " ");
		}

	}

}
