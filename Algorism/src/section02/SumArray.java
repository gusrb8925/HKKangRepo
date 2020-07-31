package section02;

//인프런 영리한 프로그래밍을 위한 알고리즘 강좌 권오흠 교수님
//순환(Recursion) 의 개념과 기본 예제 2
//배열의 합 구하기
public class SumArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(sum(5, arr));
	}

	public static int sum(int n, int[] data) {// data[0]~data[n-1]
		if (n <= 0) {
			return 0;
		} else {
			return sum(n - 1, data) + data[n - 1];
		}
	}
}
