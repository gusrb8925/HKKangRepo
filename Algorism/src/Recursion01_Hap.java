
public class Recursion01_Hap {

	public static void main(String[] args) {
		int result = func(4);
		System.out.print(result);
	}

	// 1에서 자기자신까지 합을 구하는 순환
	public static int func(int n) {
		if (n == 0)
			return 0;
		else {
			return n + func(n - 1);
		}
	}
}
