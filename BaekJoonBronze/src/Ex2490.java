import java.util.Scanner;

public class Ex2490 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num[][] = new int[3][4];
		int result[] = new int[3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				num[i][j] = sc.nextInt();
				if (num[i][j] == 1) {
					result[i]++;
				}
			}
		}
		for (int k = 0; k < 3; k++) {
			switch (result[k]) {
			case 0:
				System.out.println("D");
				break;
			case 1:
				System.out.println("C");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("A");
				break;
			case 4:
				System.out.println("E");
				break;
			}

		}
		sc.close();

	}
}