package template;

public abstract class AbstGameConnectHelper {

	protected abstract String doSecurity(String stirng);

	protected abstract boolean authentication(String id, String password);

	protected abstract int authorization(String userName);

	protected abstract String connection(String info);

	// 템플릿 메서드
	public String requestConnection(String encodedInfo) {
		// 1.보안 작업 > 암호화 된 문자열을 복호화
		String decodedInfo = doSecurity(encodedInfo);
		String id = "aaa";
		String password = "bbb";

		// 2.인증 과정
		if (!authentication(id, password)) {
			throw new Error("아이디 암호 불일치");
		}

		// 3.권한 과정
		String userName = "userName";
		int i = authorization(userName);

		switch (i) {
		case -1:
			throw new Error("셧다운");
		case 0:
			System.out.println("게임 매니저");
			break;
		case 1:
			System.out.println("게임 유료회원");
			break;
		case 2:
			System.out.println("게임 무료회원");
			break;
		case 3:
			System.out.println("권한 없음");
			break;
		default:
			break;
		}

		return connection(decodedInfo);
	}
}
