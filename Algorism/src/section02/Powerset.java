package section02;

//인프런 영리한 프로그래밍을 위한 알고리즘 강좌 권오흠 교수님
//멱집합 (powerset)
public class Powerset {
	private static char data[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
	private static int n = data.length; // 6
	private static boolean[] include = new boolean[n];

	public static void main(String[] args) {
		powerSet(4);
	}

	public static void powerSet(int k) {
		if (k == n) {
			for (int i = 0; i < n; i++) {
				if (include[i]) {
					System.out.print(data[i] + " ");
				}
			}
			System.out.println();
			return;
		}
		include[k] = false;
		powerSet(k + 1);
		include[k] = true;
		powerSet(k + 1);
	}

}
