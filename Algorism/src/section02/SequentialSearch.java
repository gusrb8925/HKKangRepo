package section02;

//인프런 영리한 프로그래밍을 위한 알고리즘 강좌 권오흠 교수님
//순환(Recursion) 의 개념과 기본 예제 3
//순차 탐색
public class SequentialSearch {

	public static void main(String[] args) {

	}

	public static int search(int[] data, int n, int target) { // 명시적 n,암시적 0
		for (int i = 0; i < n; i++) {
			if (data[i] == target) {
				return i;
			}
		}
		return -1;
	}

	// recursion
	public static int searchR1(int[] data, int begin, int end, int target) {
		if (begin > end) {
			return -1;
		} else if (target == data[begin]) {
			return begin;
		} else {
			return searchR1(data, begin + 1, end, target);
		}
	}

	public static int searchR2(int[] data, int begin, int end, int target) {
		if (begin > end) {
			return -1;
		} else if (target == data[end]) {
			return end;
		} else {
			return searchR2(data, begin, end - 1, target);
		}
	}

	public static int searchR3(int[] data, int begin, int end, int target) {
		if (begin > end) {
			return -1;
		} else {
			int middle = (begin + end) / 2;
			if (data[middle] == target) {
				return middle;
			}
			int index = searchR3(data, begin, middle - 1, target);
			if (index != -1) {
				return index;
			} else {
				return searchR3(data, middle + 1, end, target);
			}
		}
	}
}
