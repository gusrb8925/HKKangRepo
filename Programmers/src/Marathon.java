import java.util.Scanner;

public class Marathon {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String start = s.nextLine(); //참가자 입력받기
		String finish = s.nextLine();// 완주자 입력받기
		
		String[] ar = start.split("\\,");//참가자 배열
		String[] br = finish.split("\\,");//완주자 배열 
		
		for(int i=0;i<ar.length;i++) {
            for (int j=0;j<br.length;j++){
                if (ar[i].equals(br[j])) { //참가자와 완주자 같은이름이면 null처리
                    ar[i] = "";
                    br[j] = "";
                    break;
                }
            }
        }
		
		for (int i=0; i<ar.length;i++) {
			if(ar[i] != "") { //null 값이 아닌 완주자만 출력한다.
				System.out.print(ar[i]+" ");
			}
		}
		
            
	}   

}
