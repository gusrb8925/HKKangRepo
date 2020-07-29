package section11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제3-4장: 추상클래스와 인터페이스 1
//제3-5장: Generic 프로그래밍과 Generics 2
public class Scheduler {
	// private int capacity = 10;
	public ArrayList<Event> events = new ArrayList<>();
	// public Event[] events = new Event[capacity]; // 다형성 polymorphism
	// public int n = 0;
	private Scanner sc;

	public void processCommand() {
		sc = new Scanner(System.in);
		while (true) {
			System.out.print("$ ");
			String command = sc.next();
			if (command.equalsIgnoreCase("addevent")) {
				String type = sc.next();
				if (type.equalsIgnoreCase("oneday")) {
					handleAddOneDayEvent();
				} else if (type.equalsIgnoreCase("duration")) {
					handleAddDurationEvent();
				} else if (type.equalsIgnoreCase("deadline")) {
					handleAddDeadlinedEvent();
				}

			} else if (command.equalsIgnoreCase("list")) {
				handleList();
			} else if (command.equalsIgnoreCase("show")) {
				handleShow();
			} else if (command.equalsIgnoreCase("sort")) {
				Collections.sort(events);// 추상클래스 인터페이스 4강 내용
			} else if (command.equalsIgnoreCase("exit")) {
				break;
			}
		}
		sc.close();
	}

	private void handleShow() {
		String dateString = sc.next();
		MyDate theDate = parseDateString(dateString);
		// for (int i = 0; i < events.size(); i++) {
		for (Event ev : events) {// enhanced for loop
			if (ev.isRelevant(theDate)) { // isRelevant static binding
				System.out.println(ev.toString()); // toString 메서드는?? Object클래스에서 상속받아서 괜찮음.
			}
		}

	}

	private void handleList() {
		// for (int i = 0; i < events.size(); i++) {
		for (Event ev : events) {// enhanced for loop
			System.out.println("   " + ev.toString()); // events객체 > dynamic binding 반대는? static
														// binding(컴파일러에서
														// 결정)
		}

	}

	private void handleAddDeadlinedEvent() {
		System.out.print("  deadline: ");
		String dateString = sc.next();
		System.out.print("  title: ");
		String title = sc.next();

		MyDate date = parseDateString(dateString);

		DeadlinedEvent ev = new DeadlinedEvent(title, date);
		addEvent(ev);

	}

	private void handleAddDurationEvent() {
		System.out.print("  begin: ");
		String beginString = sc.next();
		System.out.print("  end: ");
		String endString = sc.next();
		System.out.print("  title: ");
		String title = sc.next();

		MyDate begin = parseDateString(beginString);
		MyDate end = parseDateString(endString);

		DurationEvent ev = new DurationEvent(title, begin, end);
		addEvent(ev);

	}

	private void handleAddOneDayEvent() {
		System.out.print("  when: ");
		String dateString = sc.next();
		System.out.print("  title: ");
		String title = sc.next();

		MyDate date = parseDateString(dateString);

		OneDayEvent ev = new OneDayEvent(title, date);
		addEvent(ev);

	}

	private void addEvent(Event ev) {
//		if (n >= capacity) {
//			reallocate(); // Array Reallocation 배열 재할당
//		}
		events.add(ev);
	}

//	private void reallocate() {
//		Event[] tmp = new Event[capacity * 2];
//		for (int i = 0; i < n; i++) {
//			tmp[i] = events[i];
//		}
//		events = tmp;
//		capacity *= 2;
//	}

	private MyDate parseDateString(String dateString) {
		String[] tokens = dateString.split("/");
		int year = Integer.parseInt(tokens[0]);
		int month = Integer.parseInt(tokens[1]);
		int day = Integer.parseInt(tokens[2]);
		MyDate d = new MyDate(year, month, day);
		return d;
	}

	public static void main(String[] args) {
		Scheduler app = new Scheduler();
		app.processCommand();
	}

}
