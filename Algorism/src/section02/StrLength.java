package section02;

//인프런 영리한 프로그래밍을 위한 알고리즘 강좌 권오흠 교수님
//순환(Recursion) 의 개념과 기본 예제 2
//문자열 길이 계산
public class StrLength {

	public static void main(String[] args) {
		String str = "ABCDE";
		System.out.println(length(str));
	}

	public static int length(String str) {
		if (str.equals("")) {
			return 0;
		} else {
			return 1 + length(str.substring(1));
		}
	}

}
