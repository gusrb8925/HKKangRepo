package section05;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제2-2장: 메서드와 생성자 1
//polynomial(다항식) 
//클래스안에 매서드 넣기
public class Polynomial2 {
	public char name; // name(다항식이름) ex) f,g
	public Term2[] terms = new Term2[100]; // 항들의 집합
	public int nTerms;// 배열속의 저장되어있는 항의 수

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
			terms[index].coef += c;
			// 계수가 0이 되면 처리하는 코드 필요.
		} else {
			int i = nTerms - 1;
			while (i >= 0 && terms[i].expo < e) {
				terms[i + 1] = terms[i];
				i--;
			}
			terms[i + 1] = new Term2();
			terms[i + 1].coef = c;
			terms[i + 1].expo = e;
			nTerms++;

		}

	}

	public int findTerm(int e) {
		for (int i = 0; i < nTerms && terms[i].expo >= e; i++) {
			if (terms[i].expo == e) {
				return i;
			}
		}
		return -1;
	}
}
