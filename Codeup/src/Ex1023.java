import java.util.Scanner;

public class Ex1023 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String[] ar = a.split("\\.");
        System.out.printf("%s\n%s", ar[0], ar[1]);
    }
        
}
