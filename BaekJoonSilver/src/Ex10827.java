import java.util.Scanner;
import java.math.BigDecimal;

public class Ex10827 {

	public static void main(String[] args) {
		BigDecimal c = new BigDecimal("0");
		Scanner sc = new Scanner(System.in);

		c = sc.nextBigDecimal();
		int b = sc.nextInt();

		BigDecimal ans = new BigDecimal("0");

		ans = c.pow(b);

		sc.close();
		System.out.println(ans.toPlainString());
	}

}
