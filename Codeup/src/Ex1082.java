import java.util.Scanner;

public class Ex1082 {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      String a = s.next();
      int b = Integer.parseInt(a, 16);
      for(int i=1; i<16; i++) {
         System.out.printf("%s*%X=%X\n", a, i, b*i);
      }
   }

}

