import java.util.Scanner;

public class Ex1088 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int i = 0;

		while (true) {
			if (i >= a) {
				break;
			}
			i++;
			if (i % 3 == 0)
				continue;// 3����̸� �Ʒ������ϰ�ݺ�
			System.out.print(i + " ");

		}

	}

}
