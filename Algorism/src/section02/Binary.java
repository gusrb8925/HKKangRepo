package section02;

//인프런 영리한 프로그래밍을 위한 알고리즘 강좌 권오흠 교수님
//순환(Recursion) 의 개념과 기본 예제 2
//2진수로 변환하여 출력
public class Binary {

	public static void main(String[] args) {
		int a = 5;
		printInBinary(a);
	}

	public static void printInBinary(int n) {
		if (n < 2) {
			System.out.print(n);
		} else {
			printInBinary(n / 2);
			System.out.print(n % 2);
		}
	}
}
