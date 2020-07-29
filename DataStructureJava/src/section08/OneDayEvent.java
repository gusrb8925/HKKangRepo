package section08;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제3-2장: 예제(Scheduler Program) 1
public class OneDayEvent extends Event {
	public MyDate date;

	public OneDayEvent(String title, MyDate date) {
		super(title);
		this.date = date;
	}

	public String toString() {
		return title + ", " + date.toString();
	}

}
