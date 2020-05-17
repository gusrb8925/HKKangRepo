import java.util.Scanner;

public class Ex1090 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		long b = s.nextLong();
		long c = s.nextLong();
		long d;
		
		d = (long) (a*Math.pow(b, c-1));
		System.out.println(d);
	}

}
