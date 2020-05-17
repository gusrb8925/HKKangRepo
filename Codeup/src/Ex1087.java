import java.util.Scanner;

public class Ex1087 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		
		int sum = 0;
		int i = 0;
		while(true) {
			i++;
			sum = sum+i;
			if (sum>=a) {
				break;
			} 
		} System.out.println(sum);
		
	}

}
