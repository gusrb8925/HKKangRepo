
public class Exam01 {

	public static void main(String[] args) {
		int i;
		int j;
		for (i=3; i<=8; i++) {
			if (i==3 || i==5) {
				System.out.println("<" +i+"´Ü>");
			}
			for (j=1; j<=9;j++) {
				int ans =i*j;
				System.out.println(i+"*"+j+"="+ans);
			}
			System.out.println("");
		}

	}

}
