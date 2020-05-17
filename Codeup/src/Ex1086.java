import java.util.Scanner;

public class Ex1086 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		long b = s.nextLong();
		long c = s.nextLong();
		double f ;
		f = (double) a*b*c/(8*Math.pow(2,10)*Math.pow(2,10));
		System.out.printf("%.2f MB", f);
	}

}
