package section05;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제2-2장: 메서드와 생성자 2
// Term(항) coefficient 계수, exponent 지수
//생성자 추가
public class Term3 {
	public int coef;
	public int expo;

	// 생성자 메서드, return이 없고 클래스명과 같은 메서드
	public Term3(int c, int e) {
		coef = c;
		expo = e;
	}

	public int calcTerm(int x) {
		return (int) (coef * Math.pow(x, expo));
	}

	public void printTerm() {
		System.out.print(coef + "x^" + expo);

	}
}
