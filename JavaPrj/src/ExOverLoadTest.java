
public class ExOverLoadTest {

	public static void main(String[] args) {
		int res1 = ExOverLoading.sum(1, 2);
		int res2 = ExOverLoading.sum(1, 2, 3);
		int res3 = ExOverLoading.sum(1, 2, 3, 4);

		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	}

}
