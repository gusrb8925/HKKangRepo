
public class Recursion01_Fibonacci {

	public static void main(String[] args) {
		int result = func(5);
		System.out.println(result);
	}

	public static int func(int n) {
		if (n < 2) {
			return n;
		} else {
			return func(n - 1) + func(n - 2);
		}
	}
}
