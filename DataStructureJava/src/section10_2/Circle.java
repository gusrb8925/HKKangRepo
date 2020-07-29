package section10_2;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제3-4장: 추상클래스와 인터페이스 2
public class Circle extends Shape {

	public int radius;

	public Circle(int r) {
		super("Circle");
		radius = r;
	}

	@Override
	public double computeArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double computeperimeter() {
		return 2.0 * Math.PI * radius;
	}

	public String toString() {
		return "Circle: radius is " + radius;
	}

}
