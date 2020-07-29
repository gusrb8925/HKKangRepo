package section10;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제3-4장: 추상클래스와 인터페이스 1
public class MyDate {
	public int year;
	public int month;
	public int day;

	public MyDate(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}

	public int compareTo(MyDate other) {
		if (year < other.year || year == other.year && month < other.month
				|| year == other.year && month == other.month && day < other.day) {
			return -1;
		} else if (year > other.year || year == other.year && month > other.month
				|| year == other.year && month == other.month && day > other.day) {
			return 1;
		} else {
			return 0;
		}
	}

	public String toString() {
		return year + "/" + month + "/" + day;
	}

}
