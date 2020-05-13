import java.util.Scanner;

public class Ex1046 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		long b = s.nextLong();
		long c = s.nextLong();
		System.out.printf("%d\n", a+b+c);
		System.out.printf("%.1f", (float)(a+b+c)/3);
	}

}
