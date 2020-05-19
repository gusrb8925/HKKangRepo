import java.util.*;

public class Marathon2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		String b = s.nextLine();
		
		String[] ar = a.split("\\,");
		String[] br = b.split("\\,");
		
		Arrays.sort(ar);
		Arrays.sort(br);
		
		int i=0;
		
		for ( i =0;i<br.length;i++) {
			if (!ar[i].equals(br[i])) {
				System.out.println(ar[i]);
				break;
			} 
		}
		
		if(i==(int)br.length) {
		System.out.println(ar[i]);
		}

	}

}
