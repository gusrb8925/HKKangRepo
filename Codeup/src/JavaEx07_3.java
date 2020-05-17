import java.util.Scanner;

public class JavaEx07_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		int b;
		
		while (true) {
			System.out.printf("더할 첫 번쨰 수 입력 :");
			a = s.nextInt();
			System.out.printf("더힐 두 번째 수 입력 :");
			b = s.nextInt();
			
			System.out.printf("%d + %d=%d \n", a, b, a+b);
		}

	}

}
