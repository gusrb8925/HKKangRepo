import java.util.Scanner;

public class Ex1045 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		long b = s.nextLong();
		System.out.printf("%d\n",a+b);
		System.out.printf("%d\n",a-b);
		System.out.printf("%d\n",a*b);
		System.out.printf("%d\n",a/b);
		System.out.printf("%d\n",a%b);
		System.out.printf("%.2f\n",(float)a/b);
		
	}

}
