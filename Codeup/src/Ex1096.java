import java.util.Scanner;

public class Ex1096 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[][] ar = new int [19][19];
		int a = s.nextInt();//흰돌놓는 수
		
		for (int i =0;i<19;i++) {
			for (int j =0;j<19;j++) {
				ar[i][j]=0;
			}
		}
		for (int j =0;j<a;j++) {
			int c = s.nextInt();
			int d = s.nextInt();
			ar[c-1][d-1]=1;
		}
		for (int x=0;x<19;x++ ) {
			for(int y=0;y<19;y++) {
				System.out.print(ar[x][y]+" ");
			}
			System.out.println();
		}

	}

}
