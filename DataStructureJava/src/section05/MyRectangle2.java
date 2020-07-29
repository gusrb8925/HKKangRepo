package section05;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제2-2장: 메서드와 생성자 2
//위왼쪽 꼭짓점좌표,높이,넓이
//클래스안에 메서드,생성자 추가
public class MyRectangle2 {
	public MyPoint2 lu;
	public int width;
	public int height;

	// 생성자 메서드
	public MyRectangle2(int x, int y, int w, int h) {
		lu = new MyPoint2(x, y);
		width = w;
		height = h;
	}

	// 생성자 메서드
	public MyRectangle2(MyPoint2 p, int w, int h) {
		lu = p;
		width = w;
		height = h;
	}

	public int calArea() {
		return width * height;
	}

	public String toString() {
		return "(" + lu.x + ", " + lu.y + ") " + width + " " + height;

	}
}