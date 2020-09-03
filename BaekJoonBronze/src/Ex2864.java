import java.io.IOException;
import java.util.Scanner;

public class Ex2864 {

	public static void main(String args[]) throws IOException {
		Scanner s = new Scanner(System.in);
		String A = s.next();
		String B = s.next();
		int min = Integer.parseInt(A.replaceAll("6", "5")) + Integer.parseInt(B.replaceAll("6", "5"));
		int max = Integer.parseInt(A.replaceAll("5", "6")) + Integer.parseInt(B.replaceAll("5", "6"));
		s.close();
		System.out.println(min + " " + max);

	}
}
