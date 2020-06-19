
public class AppleTree extends Tree {
	public void exe() {
		super.treePrint();
	}

	@Override
	public void treePrint() {
		System.out.println("수퍼클래스에서 정의한 함수를 이것으로 변경함.");
	}

	public static void main(String[] args) {
		AppleTree at = new AppleTree();
		at.treePrint();
	}
}
