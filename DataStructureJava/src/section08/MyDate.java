package section08;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제3-2장: 예제(Scheduler Program) 1
public class MyDate {
	public int year;
	public int month;
	public int day;

	public MyDate(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}

	public String toString() {
		return year + "/" + month + "/" + day;
	}

}
