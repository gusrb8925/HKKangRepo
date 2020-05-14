import java.util.Scanner;

public class Ex1067 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		if (a > 0) {
			System.out.println("plus");
		} else {
			System.out.println("minus");
		}
		if (a%2==0) System.out.println("even");
		else System.out.println("odd");

	}

}
