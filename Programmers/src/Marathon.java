import java.util.Scanner;

public class Marathon {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String start = s.nextLine(); 
		String finish = s.nextLine();
		
		String[] ar = start.split("\\,");
		String[] br = finish.split("\\,");
		
		for(int i=0;i<ar.length;i++) {
            for (int j=0;j<br.length;j++){
                if (ar[i].equals(br[j])) { 
                    ar[i] = "";
                    br[j] = "";
                    break;
                }
            }
        }
		
		for (int i=0; i<ar.length;i++) {
			if(ar[i] != "") { 
				System.out.print(ar[i]+" ");
			}
		}
		
            
	}   

}
