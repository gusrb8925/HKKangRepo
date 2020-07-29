package section07;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제3-1장: 상속(Inheritance) 1
//모든클래스는 생성자를 가진다.
//사용자가 생성자 메서드를 안만들면 기본적으로 생성자 메서드를 제공한다.
//자손들은 부모의 생성자를 호출한다. 사용자가 super로 호출하지않으면 no-parameter생성자라도를 호출한다.
public class Notebook extends Computer { // extends 로 상속받는다.

	private double screenSize;
	private double weight;

	public Notebook(String man, String proc, int ram, int disk, double speed, double screen, double weight) {
		super(man, proc, ram, disk, speed); // 부모 클래스의 생성자 호출
		screenSize = screen;
		this.weight = weight;
	}

	@Override
	public String toString() {
		String result = super.toString() + "screenSize: " + screenSize + "weight: " + weight;
		return result;
	}

	public static void main(String[] args) {
		Notebook test = new Notebook("Dell", "i5", 4, 1000, 3.2, 15.6, 1.2);

		System.out.println(test.computerPower());
		System.out.println(test.toString());
	}

}
