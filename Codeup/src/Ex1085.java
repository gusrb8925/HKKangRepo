import java.util.Scanner;

public class Ex1085 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		long b = s.nextLong();
		long c = s.nextLong();
		long d = s.nextLong();
		double f;
		
		f = (double) ((a*b*c*d)/(8*Math.pow(2, 10)*Math.pow(2, 10)));
		System.out.printf("%.1f MB", f);
	}

}
