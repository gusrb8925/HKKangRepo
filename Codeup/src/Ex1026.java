import java.util.Scanner;

public class Ex1026 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String[] ar = a.split("\\:");
		int b = Integer.valueOf(ar[1]);
		System.out.printf("%d", b);

	}

}
