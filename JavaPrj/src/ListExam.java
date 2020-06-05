import java.util.ArrayList;
import java.util.Iterator;

public class ListExam {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();

		al.add("이협건");
		al.add("홍길동");
		al.add("임꺽정");
		al.add("고길동");

		System.out.println("배열의 크기" + al.size());

		for (int i = 0; i < al.size(); i++) {
			System.out.println("[" + i + "]번째 배열 기억공간 :" + al.get(i));
		}

		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			System.out.println("이름 : " + it.next());
		}

	}

}
