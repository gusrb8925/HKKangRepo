import java.util.Scanner;

public class Ex8393 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int hap = 0;
		for (int i = 0; i <= a; i++) {
			hap += i;
		}
		System.out.println(hap);
	}

}
