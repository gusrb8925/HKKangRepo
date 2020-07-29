package section10_2;

import java.util.Arrays;
import java.util.Scanner;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제3-4장: 추상클래스와 인터페이스 2
public class ShapeApp {
	private int capacity = 10;
	private Shape[] shapes = new Shape[capacity];
	private int n = 0;
	private Scanner sc = new Scanner(System.in);

	public void processCommand() {
		while (true) {
			System.out.print("$ ");
			String command = sc.next();
			if (command.equalsIgnoreCase("add")) {
				handleAdd();
			} else if (command.equalsIgnoreCase("show") || command.equalsIgnoreCase("showdetail")) {
				handleShow(command.equalsIgnoreCase("showdetail"));
			} else if (command.equalsIgnoreCase("sort")) {
				Arrays.sort(shapes, 0, n); // generic
			} else if (command.equalsIgnoreCase("exit")) {
				break;
			}
		}
		sc.close();

	}

//	private void bubbleSort() {
//		for (int i = n - 1; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				if (shapes[j].computeArea() > shapes[j + 1].computeArea()) {
//					Shape tmp = shapes[j];
//					shapes[j] = shapes[j + 1];
//					shapes[j + 1] = tmp;
//				}
//			}
//		}
//
//	}

//	private void bubbleSort(MyComparable[] data, int size) {
//		for (int i = size - 1; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				if (data[j].compareTo(data[j + 1]) > 0) {
//					MyComparable tmp = data[j];
//					data[j] = data[j + 1];
//					data[j + 1] = tmp;
//				}
//			}
//		}
//	}

	private void handleShow(boolean detailed) {
		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + ", " + shapes[i].toString());
			if (detailed) {
				System.out.println("   Ther area is +" + shapes[i].computeArea());
				System.out.println("   Ther perimeter is +" + shapes[i].computeperimeter());
			}
		}

	}

	private void handleAdd() {
		String type = sc.next();
		switch (type) {
		case "R":
			int w = sc.nextInt();
			int h = sc.nextInt();
			Rectangle r = new Rectangle(w, h);
			addShape(r);
			break;
		case "C":
			int r1 = sc.nextInt();
			Circle c = new Circle(r1);
			addShape(c);
			break;
		case "T":
			// 삼각형
			break;
		}
	}

	private void addShape(Shape shape) {
		if (n >= capacity) {
			reallocate();
		}
		shapes[n++] = shape;
	}

	private void reallocate() {
		capacity *= 2;
		Shape[] tmp = new Shape[capacity];
		System.arraycopy(shapes, 0, tmp, 0, shapes.length); //2번쨰 방법 1.for문
		shapes = tmp;
	}

	public static void main(String[] args) {
		ShapeApp app = new ShapeApp();
		app.processCommand();

	}

}
