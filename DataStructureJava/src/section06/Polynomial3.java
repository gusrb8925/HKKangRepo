package section06;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제2-3장: static 그리고 public 1
//polynomial(다항식) 
public class Polynomial3 {
	private char name; // name(다항식이름) ex) f,g
	private Term3[] terms; // 항들의 집합
	private int nTerms;// 배열속의 저장되어있는 항의 수

	// 생성자 메서드, return이 없고 클래스명과 같은 메서드
	public Polynomial3() {
		nTerms = 0;
		terms = new Term3[100];
	}

	// 추가 생성자 메서드!!!
	public Polynomial3(char name) {
		this.name = name; // this
		nTerms = 0;
		terms = new Term3[100];
	}

	public char getName() {
		return name;
	}

	public int calcPolynomial(int x) {
		int result = 0;
		for (int i = 0; i < nTerms; i++) {
			result += terms[i].calcTerm(x);
		}
		return result;
	}

	public void printPolynomial() {
		for (int i = 0; i < nTerms; i++) {
			terms[i].printTerm();
			System.out.print("+");
		}
		System.out.println();
	}

	public void addTerm(int c, int e) {
		int index = findTerm(e); // 같은 항을 찾는 메서드
		if (index != -1) {
			terms[index].setCoef(terms[index].getCoef() + c);
			// 계수가 0이 되면 처리하는 코드 필요.
		} else {
			int i = nTerms - 1;
			while (i >= 0 && terms[i].getExpo() < e) {
				terms[i + 1] = terms[i];
				i--;
			}
			terms[i + 1] = new Term3(c, e);
			nTerms++;

		}

	}

	private int findTerm(int e) {
		for (int i = 0; i < nTerms && terms[i].getExpo() >= e; i++) {
			if (terms[i].getExpo() == e) {
				return i;
			}
		}
		return -1;
	}
}
