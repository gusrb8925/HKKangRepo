import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExSet {

	public static void main(String[] args) {
		Set<String> al = new HashSet<String>();

		al.add("객체지향");
		al.add("하둡");
		al.add("MongDB");

		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			String str = it.next();
			if (str.equals("하둡")) {
				System.out.println("<" + str + ">");
				// break;
			} else {
				System.out.println(str);
			}
		}
	}
}
