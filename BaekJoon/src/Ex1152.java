import java.util.Scanner;

public class Ex1152 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine().trim();
		String[] ar = a.split(" ");
		if (a.equals("")) {
			System.out.println("0");
		} else
			System.out.println(ar.length);

	}
}
