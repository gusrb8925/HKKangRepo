import java.util.*;

public class Ex15727 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(n / 5 + (n % 5 == 0 ? 0 : 1));
	}
}
