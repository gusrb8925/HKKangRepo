package section02;

//인프런 영리한 프로그래밍을 위한 알고리즘 강좌 권오흠 교수님
//순환(Recursion)
public class Fibonacci {

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
