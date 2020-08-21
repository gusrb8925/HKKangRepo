import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex1427 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		s.close();

		String[] ar = str.split("");
		Arrays.sort(ar, Collections.reverseOrder());

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
		}

	}

}
