
public class EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;

		for (a = 0; a < 6; a++) {
			for (b = 0; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (a = 0; a < 5; a++) {
			for (b = 0; b < 5 - a; b++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
