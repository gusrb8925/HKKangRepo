
import java.util.Scanner;

public class Ex02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		int d;
		int result;

		Scanner s = new Scanner(System.in);
		System.out.print("첫 번째 계산할 값을 입력하세요 ==>");
		a = s.nextInt();
		System.out.print("두 번째 계산할 값을 입력하세요 ==>");
		b = s.nextInt();
		System.out.print("세 번째 계산할 값을 입력하세요 ==>");
		c = s.nextInt();
		System.out.print("네 번째 계산할 값을 입력하세요 ==>");
		d = s.nextInt();

		result = a + b + c + d;
		System.out.println(a + "+" + b + "+" + c + "+" + d + "=" + result);

	}

}
