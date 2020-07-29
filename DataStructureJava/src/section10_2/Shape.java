package section10_2;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제3-4장: 추상클래스와 인터페이스 2
public abstract class Shape implements Comparable {
	public String shapeName;

	public Shape(String name) {
		shapeName = name;
	}

	public abstract double computeArea();

	public abstract double computeperimeter();
	
	@Override
	public int compareTo(Object other) {
		double myArea = computeArea();
		double yourArea = ((Shape) other).computeArea();
		if (myArea < yourArea) {
			return -1;
		} else if (myArea == yourArea) {
			return 0;
		} else {
			return 1;
		}

	}

}
