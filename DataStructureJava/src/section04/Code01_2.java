package section04;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제2-1장: 클래스, 객체, 참조변수 2
//

public class Code01_2 {

	public static void main(String[] args) {

		Person1 first = new Person1(); // new로 객체(object)생성 / first는 '='로 객체를 참조한다!!!
		first.name = "Kang";
		first.number = "01012341234";
		System.out.println("name: " + first.name + ", number: " + first.number);

		Person1 second; // Person1의 새로운 참조변수 second를 선언
		second = first; // first가 참조하고있는 주소를 second에 넣어준다.
		second.name = "Tom";
		System.out.println("name: " + first.name + ", number: " + first.number);
		// System.out.println("name: " + second.name + ", number: " + second.number);

		Person1[] members = new Person1[10]; // Person1타입의 각각가지는 배열 선언. 하지만 각칸은 참조변수이다.
		members[0] = first;
		members[1] = second; // first,second 같은 객체를 참조한다.
		System.out.println("name: " + members[0].name + ", number: " + members[0].number);
		System.out.println("name: " + members[1].name + ", number: " + members[1].number);

		// member[2]는 참조변수이다. 따라서 새로운 객체를 생성 그객체의 주소값을 저장할수밖에 없다.
		// members[2].name = "David";
		// members[2].number = "12313124";
		// System.out.println( members[2].name + members[2].number);
		// 따라서 new롤 객체생성.
		members[2] = new Person1();
		members[2].name = "David";
		members[2].number = "12313124";
		System.out.println("name: " + members[2].name + ", number: " + members[2].number);

	}
	// int[] numbers = new int[8];
	// 배열은 프리미티브타입이아니다.
	// 따라서 numbers 는 참조변수이다. 따라서 배열의 주소를 저장하고있다.
	// new int[8] 배열 객체생성

}
