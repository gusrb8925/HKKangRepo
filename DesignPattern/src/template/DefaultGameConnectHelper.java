package template;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String stirng) {
		System.out.println("강화 디코드");
		return stirng;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("아이디/암호 확인 과정");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("권한 확인");
		// 셧다운제 구현
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("마지막 접속단계");
		return info;
	}

}
