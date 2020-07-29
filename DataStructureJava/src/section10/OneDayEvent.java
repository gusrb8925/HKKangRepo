package section10;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제3-4장: 추상클래스와 인터페이스 1
public class OneDayEvent extends Event {
	public MyDate date;

	public OneDayEvent(String title, MyDate date) {
		super(title);
		this.date = date;
	}

	@Override
	public boolean isRelevant(MyDate date) {
		return this.date.compareTo(date) == 0;
	}

	@Override
	public String toString() {
		return title + ", " + date.toString();
	}

	@Override
	public MyDate getRepresentativeDate() {
		return date;
	}

}
