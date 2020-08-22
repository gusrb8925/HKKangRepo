import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1977 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Integer> al = new ArrayList<>();
		int a = s.nextInt();
		int b = s.nextInt();
		s.close();

		int sum = 0;
		int c = 0;
		for (int i = 1; i <= 100; i++) {
			c = i * i;
			if (c >= a && c <= b) {
				al.add(c);
				sum += c;
			}
		}

		if (sum > 0) {
			System.out.println(sum);
			System.out.println(al.get(0));
		} else {
			System.out.println(-1);
		}
	}

}
