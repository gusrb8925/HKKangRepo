package section02;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제1-2장: 메서드 호출과 프로그램의 기능적 분할1
//소수찾기 기능적분할
public class Code17 {

	public static void main(String[] args) {
		for (int n = 0; n <= 100000; n++) {
			if (isPrime(n)) {
				System.out.println(n);
			}
		}
	}

	public static boolean isPrime(int k) {

		if (k < 2) {
			return false;
		}
		for (int i = 2; i * i <= k; i++) {
			if (k % i == 0) {
				return false;
			}
		}
		return true;
	}

}
