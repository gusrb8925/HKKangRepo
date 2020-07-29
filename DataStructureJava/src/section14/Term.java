package section14;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제4-3장: 연결리스트와 Iterator
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
