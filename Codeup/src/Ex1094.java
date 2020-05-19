import java.util.Scanner;

public class Ex1094 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int[] b = new int[a];
		
		for (int i =0;i<a;i++) {
			b[i]=s.nextInt();
		}
		for(int j=a;j>=1;j--) {
			System.out.printf("%d ", b[j-1]);
		}

	}

}
