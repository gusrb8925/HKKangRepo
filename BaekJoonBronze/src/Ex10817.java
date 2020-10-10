import java.util.Arrays;
import java.util.Scanner;

public class Ex10817 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] ar = new int[3];
		for (int i=0; i<3;i++) {
			ar[i] = s.nextInt();
		}
		Arrays.sort(ar);
		
		System.out.println(ar[1]);
	}

}
