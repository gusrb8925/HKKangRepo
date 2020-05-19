import java.util.Scanner;

public class Ex1024 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		int len = a.length();
		for (int i = 0; i < len; i++) {
			System.out.printf("\'%s\'\n", a.charAt(i));
		}
	}

}