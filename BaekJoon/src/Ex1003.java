import java.util.Scanner;

public class Ex1003 {
	private static int onecnt = 0;
	private static int zerocnt = 0;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for (int i = 0; i < a; i++) {
			fi(s.nextInt());
			System.out.println(zerocnt + " " + onecnt);
			onecnt = 0;
			zerocnt = 0;
		}
	}

	public static int fi(int n) {
		if (n == 0) {
			zerocnt++;
			return 0;
		} else if (n == 1) {
			onecnt++;
			return 1;
		} else {
			return fi(n - 1) + fi(n - 2);
		}

	}

}
