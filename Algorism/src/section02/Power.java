package section02;

//인프런 영리한 프로그래밍을 위한 알고리즘 강좌 권오흠 교수님
//순환(Recursion)
public class Power {

	public static void main(String[] args) {
		double result1 = func(3.5, 2);
		System.out.println(result1);
		double result2 = func(3, 2);
		System.out.println(result2);
	}

	// x^n / n>0
	public static double func(double x, int n) {
		if (n == 0) {
			return 1;
		} else {
			return x * func(x, n - 1);
		}
	}

}
