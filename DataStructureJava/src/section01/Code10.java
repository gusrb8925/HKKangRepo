package section01;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제1-1장: 변수,배열,반복문 5
//1~100000 모든 소수찾기
public class Code10 {

	public static void main(String[] args) {
		for (int n = 2; n <= 100000; n++) {
			boolean isPrime = true;
			for (int i = 2; i * i <= n && isPrime; i++) {
				if (n % i == 0) {
					isPrime = false;
					// break; or for조건문의 isPrime
				}
			}

			if (isPrime) {
				System.out.println(n);
			}
		}

	}

}
