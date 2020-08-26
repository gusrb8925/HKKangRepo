
public class Ex2 {

	public static void main(String[] args) {
		int i = 3;
		while (i < 9) {
			if (i == 3 || i == 5) {
				System.out.println("<" + i + "단>");
			}
			int j = 1;
			while (j <= 9) {
				System.out.println(i + "*" + j + "=" + (i * j));
				j++;

			}
			i++;
			System.out.println();
		}
	}

}
