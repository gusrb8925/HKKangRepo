
public class Ex4673 {

	public static void main(String[] args) {
		int[] arr = new int[10001];
		for (int i = 1; i < arr.length; i++) {
			int index = fun(i);
			if (index < 10001) {
				arr[index] = 1;
			}
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != 1) {
				System.out.println(i);
			}
		}

	}

	public static int fun(int n) {
		int result = n;
		while (n > 0) {
			result += n % 10;
			n /= 10;
		}
		return result;
	}
}
