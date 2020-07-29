package section10;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제3-4장: 추상클래스와 인터페이스 1
//추상클래스 추상메서드를 하나라도 가지면 추상클래스
//추상클래스는 객체를 만들수없음.즉 객체를 만들지않으면 추상클래스로 선언할수있음. 
//서브클래스를 만드는 용도
//추상메서드를 상속받은 자식클래스는 추상메서드를 구현해야함.
public abstract class Event implements Comparable {
	public String title;

	public Event(String title) {
		this.title = title;
	}

	public abstract boolean isRelevant(MyDate date);

	public abstract MyDate getRepresentativeDate();

	@Override
	public int compareTo(Object other) {
		MyDate mine = getRepresentativeDate();
		MyDate yours = ((Event) other).getRepresentativeDate();
		return mine.compareTo(yours);

	}

}
