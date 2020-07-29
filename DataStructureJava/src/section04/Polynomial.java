package section04;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제2-1장: 클래스, 객체, 참조변수 5
//polynomial(다항식) 
public class Polynomial {
	public char name; // name(다항식이름) ex) f,g
	public Term[] terms = new Term[100]; // 항들의 집합
	public int nTerms;// 배열속의 저장되어있는 항의 수
}
