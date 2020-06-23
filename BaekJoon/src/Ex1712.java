import java.util.Scanner;

public class Ex1712 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long staticCost = s.nextLong();
		long cost = s.nextLong();
		long price = s.nextLong();
		if (cost >= price) {
			System.out.println("-1");
		} else {
			System.out.println(staticCost / (price - cost) + 1);
		}

	}

}
