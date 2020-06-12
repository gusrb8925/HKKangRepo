import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Ex5 {

	public static void main(String[] args) {
		List<Map<String, String>> rList = new ArrayList<>();
		Map<String, String> pMap = new HashMap<>();
		pMap.put("name", "이협건");
		pMap.put("email", "h.lee@");
		pMap.put("addr", "서울");
		rList.add(pMap);
		pMap = null;

		pMap = new HashMap<>();
		pMap.put("name", "홍길동");
		pMap.put("email", "g.hong@");
		pMap.put("addr", "경기");
		rList.add(pMap);
		pMap = null;

		Iterator<Map<String, String>> it = rList.iterator();
		while (it.hasNext()) {
			Map<String, String> rMap = it.next();
			System.out.println("name : " + rMap.get("name"));
			System.out.println("email : " + rMap.get("email"));
			System.out.println("addr : " + rMap.get("addr"));
			System.out.println();
			rMap = null;
		}
	}
}