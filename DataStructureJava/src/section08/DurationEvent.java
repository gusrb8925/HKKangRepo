package section08;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제3-2장: 예제(Scheduler Program) 1
public class DurationEvent extends Event {
	public MyDate begin;
	public MyDate end;

	public DurationEvent(String title, MyDate b, MyDate e) {
		super(title);
		begin = b;
		end = e;
	}

	public String toString() {
		return title + ", " + begin.toString() + "~" + end.toString();
	}
}
