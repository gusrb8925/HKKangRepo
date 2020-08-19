package strategy;

//인터페이스:기능을 사용하는 통로,기능에 대한 선언과 구현 분리
//델리게이트:특정 객체의 기능을 사용하기 위해 다른 객체의 기능을 사용하는것

//스트레티지패턴:여러 알고리즘을 하나의 추상적인 접근점(인터페이스)을 만들어 
//접근 점에서 서로 교환가능하도록 하는 패턴.
public class Main {

	public static void main(String[] args) {
		Ainterface ainterface = new AinterfaceImpl();

		// 통로
		ainterface.funcA();

		AObj aObj = new AObj();
		aObj.funcAA();
	}

}
