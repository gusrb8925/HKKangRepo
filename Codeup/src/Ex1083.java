import java.util.Scanner;

public class Ex1083 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		for (int i=1; i<=a; i++) {
			if (i==3||i==6||i==9) {
				System.out.println("X");
			} else System.out.println(i);
		}
			
	}

}
