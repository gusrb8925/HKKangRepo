package strategy;

public class AObj {
	Ainterface ainterface;

	public AObj() {
		ainterface = new AinterfaceImpl();
	}

	public void funcAA() {
		// ~기능이 필요합니다. 개발해주세요~~
		// 위임하다(delegate)
		ainterface.funcA();
		ainterface.funcA();
	}
}
