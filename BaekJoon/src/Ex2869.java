import java.util.Scanner;

public class Ex2869 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int v = s.nextInt();
		int day = 0;
		day = (v - b) / (a - b);
		if ((v - b) % (a - b) != 0) {
			day++;
		}
		System.out.println(day);
	}

}
