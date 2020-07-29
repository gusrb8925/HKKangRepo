package section10_2;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제3-4장: 추상클래스와 인터페이스 2
public class Rectangle extends Shape {

	public int width;
	public int height;

	public Rectangle(int w, int h) {
		super("Reactangle");
		width = w;
		height = h;
	}

	@Override
	public double computeArea() {
		return (double) width * height;
	}

	@Override
	public double computeperimeter() {
		return 2.0 * (width + height);
	}

	public String toString() {
		return "Rectangle :width is " + width + ", height is " + height;
	}
}
