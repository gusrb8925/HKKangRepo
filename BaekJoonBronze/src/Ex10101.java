import java.util.Scanner;

public class Ex10101 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if (a + b + c != 180)
			System.out.println("Error");
		else {
			if (a == b) {
				if (b == c)
					System.out.println("Equilateral");
				else
					System.out.println("Isosceles");
			} else {
				if (b == c)
					System.out.println("Isosceles");
				else {
					if (a == c)
						System.out.println("Isosceles");
					else
						System.out.println("Scalene");
				}
			}
		}
		s.close();
	}

}
