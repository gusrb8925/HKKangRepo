package section08;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제3-2장: 예제(Scheduler Program) 1
public class DeadlinedEvent extends Event {
	public MyDate deadline;

	public DeadlinedEvent(String title, MyDate date) {
		super(title);
		deadline = date;

	}

	public String toString() {
		return title + ", " + deadline.toString();
	}
}
