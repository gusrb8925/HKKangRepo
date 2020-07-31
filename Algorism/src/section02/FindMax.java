package section02;

//인프런 영리한 프로그래밍을 위한 알고리즘 강좌 권오흠 교수님
//순환(Recursion) 의 개념과 기본 예제 3
//최대값 찾기
public class FindMax {

	public static void main(String[] args) {

	}

	public static int findMax1(int[] data, int begin, int end) {
		if (begin == end) {
			return data[begin];
		} else {
			return Math.max(data[begin], findMax1(data, begin + 1, end));
		}
	}

	public static int findMax2(int[] data, int begin, int end) {
		if (begin == end) {
			return data[begin];
		} else {
			int middle = (begin + end) / 2;
			int max1 = findMax2(data, begin, middle);
			int max2 = findMax2(data, middle + 1, end);
			return Math.max(max1, max2);
		}
	}

}
