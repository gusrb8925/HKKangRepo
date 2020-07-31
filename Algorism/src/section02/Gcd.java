package section02;

//인프런 영리한 프로그래밍을 위한 알고리즘 강좌 권오흠 교수님
//순환(Recursion) 의 개념과 기본 예제 1
public class Gcd {

	public static void main(String[] args) {
		int m1 = 13;
		int n1 = 5;
		System.out.println(gcd1(m1, n1));
		System.out.println(gcd2(m1, n1));
		int m2 = 13;
		int n2 = 5;
		System.out.println(gcd1(m2, n2));
		System.out.println(gcd2(m2, n2));
	}

	// greatest common divisor(gcd) /유클리드 호제법
	// http://lonpeach.com/2017/11/12/Euclidean-algorithm/
	// a,b에 대해서 a를 나눈 나머지를 r이라하면 a,b의 최대 공약수는 b,r의 최대공약수와 같다.
	// 78969 = 19332*4 +1368 결국 78969와 19332의 최대 공약수는 19332와 1368의 최대공약수와 같다.
	public static int gcd1(int m, int n) {
		if (m < n) {
			int tmp = m;
			m = n;
			n = tmp;
		} // m이 큰수, n인 작은수/ 만약 반대의 경우 스위치하는 if문

		if (m % n == 0) {
			return n;
		} else
			return gcd1(n, m % n);
	}

	public static int gcd2(int p, int q) {
		if (q == 0) {
			return p;
		} else {
			return gcd2(q, p % q);
		}
	}

	// lowest common multiple(lcm) 최소공배수
	public static int lcm(int m, int n) {
		return m * n / gcd1(m, n);
	}

}
