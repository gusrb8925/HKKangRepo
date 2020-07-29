package section08;

import java.util.Scanner;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제3-2장: 예제(Scheduler Program) 1
public class Scheduler {
	private int capacity = 10;
	public Event[] events = new Event[capacity]; // 다형성 polymorphism
	public int n = 0;
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

			} else if (command.equalsIgnoreCase("exit")) {
				break;
			}
		}
		sc.close();
	}

	private void handleList() {
		for (int i = 0; i < n; i++) {
			System.out.println("   " + events[i].toString()); // dynamic binding 반대는? static binding(컴파일러에서 결정)
		}
	}

	private void handleAddDeadlinedEvent() {

	}

	private void handleAddDurationEvent() {

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

	private void addEvent(OneDayEvent ev) {
		if (n >= capacity) {
			reallocate(); // Array Reallocation 배열 재할당
		}
		events[n++] = ev;
	}

	private void reallocate() {
		Event[] tmp = new Event[capacity * 2];
		for (int i = 0; i < n; i++) {
			tmp[i] = events[i];
		}
		events = tmp;
		capacity *= 2;
	}

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
