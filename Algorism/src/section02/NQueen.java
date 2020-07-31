package section02;

//인프런 영리한 프로그래밍을 위한 알고리즘 강좌 권오흠 교수님
//순환(Recursion) 의 응용 - n queens problem
//상태공간트리-찾는 해를 포함하는 트리.
public class NQueen {
	private static int N = 8;
	private static int[] cols = new int[N + 1];

	public static void main(String[] args) {
		queens(0);
	}

	public static boolean queens(int level) {
		if (!promising(level)) {
			return false;
		} else if (level == N) {
			for (int i = 1; i <= N; i++) {
				System.out.println("(" + i + "," + cols[i] + ")");
			}
			return true;
		}
		for (int i = 1; i <= N; i++) {
			cols[level + 1] = i;
			if (queens(level + 1)) {
				return true;
			}
		}
		return false;

	}

	private static boolean promising(int level) {
		for (int i = 1; i < level; i++) {
			if (cols[i] == cols[level]) { //같은 열이라면 x
				return false;
			} else if (level - i == Math.abs(cols[level] - cols[i])) { //대각 체크
				return false;
			}
		}
		return true;
	}
}
