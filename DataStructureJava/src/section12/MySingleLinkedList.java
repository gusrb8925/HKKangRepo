package section12;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제4-1장: 연결리스트의 개념과 기본연산
public class MySingleLinkedList<T> {
	public Node<T> head;
	public int size;

	public MySingleLinkedList() {
		head = null;
		size = 0;
	}

	public void add(int index, T item) {
		if (index < 0 || index > size) {
			return; // 좋은코드는 아니다.
		}
		if (index == 0) {
			addFirst(item);
		} else {
			Node<T> node = getNode(index - 1);
			addAfter(node, item);
		}
	}

	public void addFirst(T item) {
		Node<T> newNode = new Node<T>(item);
		newNode.next = head;
		head = newNode;
		size++;
	}

	public void addAfter(Node<T> before, T item) {
		Node<T> newNode = new Node<T>(item);
		newNode.next = before.next;
		before.next = newNode;
		size++;
	}

	public T remove(int index) {
		if (index < 0 || index >= size) {
			return null;
		}
		if (index == 0) {
			return removeFirst();
		}
		Node<T> prev = getNode(index - 1);
		return removeAfter(prev);
	}

	public T remove(T item) {
		Node<T> p = head;
		Node<T> q = null;
		while (p != null && !p.data.equals(item)) {
			q = p;
			p = p.next;
		}
		if (p == null) {
			return null;
		}
		if (q == null) {
			return removeFirst();
		} else {
			return removeAfter(q);
		}

	}

	public T removeFirst() {
		if (head == null) {
			return null;
		} else {
			T tmp = head.data;
			head = head.next;
			size--;
			return tmp;
		}
	}

	public T removeAfter(Node<T> before) {
		if (before.next == null) {
			return null;
		} else {
			T tmp = before.data;
			before.next = before.next.next;
			return tmp;
		}
	}

	public T get(int index) {
		if (index < 0 || index >= size) {
			return null;
		}
//		Node<T> p = head;
//		for (int i = 0; i < index; i++) {
//			p = p.next;
//		}
//		return p.data;
		return getNode(index).data;
	}

	public Node<T> getNode(int index) {
		if (index < 0 || index >= size) {
			return null;
		}
		Node<T> p = head;
		for (int i = 0; i < index; i++) {
			p = p.next;
		}
		return p;
	}

	public int indexOf(T item) {
		Node<T> p = head;
		int index = 0;
		while (p != null) {
			if (p.data.equals(item)) {
				return index;
			}
			p = p.next;
			index++;
		}
		return -1;
	}

	public static void main(String[] args) {
		MySingleLinkedList<String> list = new MySingleLinkedList<>();
		list.add(0, "Saturday");
		list.add(1, "Friday");
		list.add(0, "Monday"); // M,S,F
		list.add(2, "Tuesday"); // M,S,T,F

		String str = list.get(2); // Tuesday
		list.remove(2); // M,S,F
		int pos = list.indexOf("Friday"); // 2
		System.out.println(str);
		System.out.println(pos);
	}

}
