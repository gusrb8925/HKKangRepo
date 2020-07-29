package section11;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제3-4장: 추상클래스와 인터페이스 1
public class DeadlinedEvent extends Event {
	public MyDate deadline;

	public DeadlinedEvent(String title, MyDate date) {
		super(title);
		deadline = date;

	}

	@Override
	public boolean isRelevant(MyDate date) {
		return deadline.compareTo(date) >= 0;
	}

	@Override
	public String toString() {
		return title + ", " + deadline.toString();
	}

	@Override
	public MyDate getRepresentativeDate() {
		return deadline;
	}

}
