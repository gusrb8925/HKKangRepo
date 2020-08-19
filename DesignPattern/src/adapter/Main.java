package adapter;

//adapter 패턴: 알고리즘을 요구사항에 변경 사용하는것.
public class Main {

	public static void main(String[] args) {
		Adapter adapter = new AdapterImpl();
		System.out.println(adapter.twiceOf(100f));
		System.out.println(adapter.halfOf(100f));
	}

}
