
public class Recursion01_Facktorial {

	public static void main(String[] args) {
		int result1 = func(4);
		System.out.println(result1);
		int result2 = func(0);
		System.out.println(result2);
	}

	// n! 구하기 / 0! =1이다.
	public static int func(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * func(n - 1);
		}
	}
}
