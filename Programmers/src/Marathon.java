import java.util.Scanner;

public class Marathon {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String start = s.nextLine(); //������ �Է¹ޱ�
		String finish = s.nextLine();// ������ �Է¹ޱ�
		
		String[] ar = start.split("\\,");//������ �迭
		String[] br = finish.split("\\,");//������ �迭 
		
		for(int i=0;i<ar.length;i++) {
            for (int j=0;j<br.length;j++){
                if (ar[i].equals(br[j])) { //�����ڿ� ������ �����̸��̸� nulló��
                    ar[i] = "";
                    br[j] = "";
                    break;
                }
            }
        }
		
		for (int i=0; i<ar.length;i++) {
			if(ar[i] != "") { //null ���� �ƴ� �����ڸ� ����Ѵ�.
				System.out.print(ar[i]+" ");
			}
		}
		
            
	}   

}
