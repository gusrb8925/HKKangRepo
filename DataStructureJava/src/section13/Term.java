package section13;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제4-2장: 연결리스트 응용예(다항식 프로그램)
public class Term {
	public int coef;
	public int expo;

	public Term(int c, int e) {
		coef = c;
		expo = e;
	}

	public int calc(int x) {
		return coef * (int) Math.pow(x, expo);
	}

	public String toString() {
		return coef + "x^" + expo;
	}
}
