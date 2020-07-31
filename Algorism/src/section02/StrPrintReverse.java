package section02;

//인프런 영리한 프로그래밍을 위한 알고리즘 강좌 권오흠 교수님
//순환(Recursion) 의 개념과 기본 예제 2
//문자열 뒤집어서 프린트
public class StrPrintReverse {

	public static void main(String[] args) {
		String str = "ABCDE";
		printCharsReverse(str);
	}

	public static void printCharsReverse(String str) {
		if (str.length() == 0) {
			return;
		} else {
			printCharsReverse(str.substring(1));
			System.out.print(str.charAt(0));
		}
	}

}
