import java.util.Scanner;

public class Ex10833 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int result = 0;
		for (int i = 0; i < n; i++) {
			int stu = s.nextInt();
			int apple = s.nextInt();
			result += apple % stu;
		}
		s.close();
		System.out.println(result);
	}

}
