
public class Ex3 {

	public static void main(String[] args) {
		int[] ar = new int[90];
		int i = 0;
		int hap = 0;

		for (i = 0; i < 90; i++) {
			ar[i] = i + 11;
			hap += ar[i];
		}

		i = 0;
		while (i < 90) {
			System.out.println("ar[" + i + "] : " + ar[i]);
			i++;
		}
		System.out.println("합 : " + hap);
	}

}
