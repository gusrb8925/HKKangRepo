package template;

//템플릿 메서드: 알고리즘 구조를 메서드에 정의하고 하위클래스에서 알고리즘을 재정의.
//구현하려는 알고리즘이 일정한 프로세스(과정), 변경가능성이 있다면
//1.알고리즘을 여러 단계로 나눈다.
//2.나눠진 알고리즘의 메서드를 선언한다.
//3.알고리즘을 수행할 템플릿 메서드를 만든다.
//4.하위 클래스에서 메서드를 구현한다.
public class Main {

	public static void main(String[] args) {
		AbstGameConnectHelper helper = new DefaultGameConnectHelper();

		helper.requestConnection("아이디, 암호 등접속 정보");
	}

}
