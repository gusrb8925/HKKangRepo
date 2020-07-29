package section04;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제2-1장: 클래스, 객체, 참조변수 1
//

public class Code01 {

	public static void main(String[] args) {

		// 클래스는 하나의 타입이다(ex.int double...) 사용자 정의 타입
		// 데이터를 저장할려면 클래스타입의 변수를 선언해서 거기에 저장한다.
		Person1 first = new Person1(); // new로 객체(object)생성 / first는 '='로 객체를 참조한다!!!
		first.name = "Kang";
		first.number = "01012341234";
		System.out.println("name: " + first.name + ", number: " + first.number);

		Person1[] members = new Person1[10];
		members[0] = first;
		members[1] = new Person1();
		members[1].name = "David";
		members[1].number = "01023452345";
		System.out.println("name: " + members[1].name + ", number: " + members[1].number);

	}
	// 모든 프리미티브 타입의 변수는 보통변수이다.
	// 변수자체에 값이 저장된다.
	// 프리미티브 타입이 아닌 모든 변수는 참조변수이다.
	// 실제 데이터가 저장될 객체는 new명령으로 따로 만들어야하고
	// 참조변수에는 그객체의 주소를 저장한다.

}
