
import java.util.Scanner;

public class Ex02_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int result;
		int k;

		Scanner s = new Scanner(System.in);
		System.out.print("Ã¹ ¹øÂ° °è»êÇÒ °ªÀ» ÀÔ·ÂÇÏ¼¼¿ä ==>");
		a = s.nextInt();
		System.out.print("<1>µ¡¼À <2>»¬¼À <3>°ö¼À <4>³ª´°¼À ==>");
		k = s.nextInt();
		System.out.print("µÎ ¹øÂ° °è»êÇÒ °ªÀ» ÀÔ·ÂÇÏ¼¼¿ä ==>");
		b = s.nextInt();

		if (k == 1) {
			result = a + b;
			System.out.println(a + "+" + b + "=" + result);
		}

		if (k == 2) {
			result = a - b;
			System.out.println(a + "-" + b + "=" + result);
		}
		if (k == 3) {
			result = a * b;
			System.out.println(a + "*" + b + "=" + result);
		}
		if (k == 4) {
			result = a / b;
			System.out.println(a + "/" + b + "=" + result);
		}
	}

}
