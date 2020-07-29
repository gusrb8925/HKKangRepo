package section02;
//인프런 영리한 프로그래밍을 위한 알고리즘 강좌 권오흠 교수님
//순환(Recursion)
public class Facktorial {

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
