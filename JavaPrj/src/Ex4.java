import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex4 {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();

		al.add("객체지향");
		al.add("하둡");
		al.add("MongDB");

		int a = 1;
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			if (a == 1) {
				System.out.println("<" + it.next() + ">");
			} else {
				System.out.println(it.next());
			}
			a++;
		}
	}
}
