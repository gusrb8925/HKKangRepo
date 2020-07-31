package section02;

//인프런 영리한 프로그래밍을 위한 알고리즘 강좌 권오흠 교수님
//순환(Recursion) 의 개념과 기본 예제 1
public class Hap {

	public static void main(String[] args) {
		int result = func(4);
		System.out.print(result);
	}

	// 1에서 자기자신까지 합을 구하는 순환
	public static int func(int n) {
		if (n == 0)
			return 0;
		else {
			return n + func(n - 1);
		}
	}
}
