package section10_2;
//인프런 Java로 배우는 자료구조 권오흠교수님
//제3-4장: 추상클래스와 인터페이스 2
//추상메서드만을 가진 순수한 추상 클래스
//다중 상속가능
//static final 데이터 멤버(상수)가질 수 있음.
public interface MyComparable {
	public int compareTo(Object o);
}
