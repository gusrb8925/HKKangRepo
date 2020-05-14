import java.util.Scanner;

public class Ex1025_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		char[] ar = a.toCharArray();
		for (int i=0;i<ar.length;i++) {
			System.out.print("[" + ar[i]);
			for (int j=ar.length-1;i<j;j--) {
				System.out.print(0);
				
			}
			System.out.print("]\n");
		}
		

	}

}
