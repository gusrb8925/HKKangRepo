import java.util.Scanner;

public class JavaEx07_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		int b;
		
		while (true) {
			System.out.printf("첫 번째 값을 입력하세요 :");
			a = s.nextInt();
			System.out.printf("두 번째 값을 입력하세요:");
			b = s.nextInt();
			
			System.out.printf("%d + %d=%d \n", a, b, a+b);
		}

	}

}
