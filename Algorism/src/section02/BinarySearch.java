package section02;

//인프런 영리한 프로그래밍을 위한 알고리즘 강좌 권오흠 교수님
//순환(Recursion) 의 개념과 기본 예제 3
//이진 검색 (데이터가 크기순으로 정렬되어있을 때 사용가능)
public class BinarySearch {

	public static void main(String[] args) {

	}

	public static int binarySearch(String[] items, String target, int begin, int end) {
		if (begin > end) {
			return -1;
		} else {
			int middle = (begin + end) / 2;
			int compResult = target.compareTo(items[middle]);
			if (compResult == 0) {
				return middle;
			} else if (compResult < 0) {
				return binarySearch(items, target, begin, middle - 1);
			} else {
				return binarySearch(items, target, middle + 1, end);
			}
		}
	}

}
