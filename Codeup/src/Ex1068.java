import java.util.Scanner;

public class Ex1068 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if (90<=a) {
			System.out.println("A");
		}else if (a>=70) {
			System.out.println("B");
		}else if (a>=40) {
			System.out.println("C");
		}else System.out.println("D");
	}

}
