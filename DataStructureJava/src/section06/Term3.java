package section06;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제2-3장: static 그리고 public 1
// Term(항) coefficient 계수, exponent 지수
public class Term3 {
	private int coef;
	private int expo;

	// 생성자 메서드, return이 없고 클래스명과 같은 메서드
	public Term3(int c, int e) {
		setCoef(c);
		expo = e;
	}

	public int getExpo() {
		return expo;
	}

	public int calcTerm(int x) {
		return (int) (getCoef() * Math.pow(x, expo));
	}

	public void printTerm() {
		System.out.print(getCoef() + "x^" + expo);

	}

	public int getCoef() {
		return coef;
	}

	public void setCoef(int coef) {
		this.coef = coef;
	}
}
