package section10;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제3-4장: 추상클래스와 인터페이스 1
public class DurationEvent extends Event {
	public MyDate begin;
	public MyDate end;

	public DurationEvent(String title, MyDate b, MyDate e) {
		super(title);
		begin = b;
		end = e;
	}

	@Override
	public boolean isRelevant(MyDate date) {
		return begin.compareTo(date) <= 0 && end.compareTo(date) >= 0;
	}

	@Override
	public String toString() {
		return title + ", " + begin.toString() + "~" + end.toString();
	}

	@Override
	public MyDate getRepresentativeDate() {
		return begin;
	}
}
