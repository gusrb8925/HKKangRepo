package section05;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제2-2장: 메서드와 생성자 3
public class OrthoLine {
	public MyPoint2 u;
	public MyPoint2 v;

	// 생성자 메서드
	public OrthoLine(MyPoint2 p, MyPoint2 q) {
		u = p;
		v = q;
		if (p.x > q.x || p.x == q.x && p.y > q.y) {
			swap();
		}
	}

	public void swap() {
		MyPoint2 tmp = u;
		u = v;
		v = tmp;
	}

	// 생성자 메서드
	public OrthoLine(int x1, int y1, int x2, int y2) {
		u = new MyPoint2(x1, y1);
		v = new MyPoint2(x2, y2);
	}

	public boolean isVertical() {
		return (u.x == v.x);
	}

}
