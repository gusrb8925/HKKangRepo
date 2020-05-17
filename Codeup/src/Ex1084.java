import java.util.Scanner;

public class Ex1084 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		for (int i=0; i<a; i++) {
			for(int j=0; j<b;j++) {
				for(int n=0; n<c; n++) {
					System.out.println(i+""+j+""+n);
					}
			}
		}
		System.out.println(a*b*c);
}

}
