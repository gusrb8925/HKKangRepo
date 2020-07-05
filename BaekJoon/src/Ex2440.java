import java.util.Scanner;

public class Ex2440 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for (int i = 0; i < a; i++) {
			for (int j = i; j <a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
