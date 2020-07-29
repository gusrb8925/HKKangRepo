package section14;

import java.util.Iterator;
import java.util.NoSuchElementException;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제4-3장: 연결리스트와 Iterator
public class MySingleLinkedList<T> {
	private Node<T> head;
	private int size;

	public MySingleLinkedList() {
		head = null;
		size = 0;
	}

	// inner class
	private static class Node<T> {
		public T data;
		public Node<T> next;

		public Node(T item) {
			data = item;
			next = null;
		}
	}

	public Iterator<T> iterator() {
		return new MyIterator();
	}

	// inner class
	private class MyIterator implements Iterator<T> {
		private Node<T> nextNode;

		public MyIterator() {
			nextNode = head;
		}

		@Override
		public boolean hasNext() {
			return nextNode != null;
		}

		@Override
		public T next() {
			if (nextNode == null) {
				throw new NoSuchElementException();
			}
			T val = nextNode.data;
			nextNode = nextNode.next;
			return val;
		}

		public void remove() {

		}

	}

	public void add(int index, T item) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		if (index == 0) {
			addFirst(item);
		} else {
			Node<T> node = getNode(index - 1);
			addAfter(node, item);
		}
	}

	private void addFirst(T item) {
		Node<T> newNode = new Node<T>(item);
		newNode.next = head;
		head = newNode;
		size++;
	}

	private void addAfter(Node<T> before, T item) {
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

	private T removeFirst() {
		if (head == null) {
			return null;
		} else {
			T tmp = head.data;
			head = head.next;
			size--;
			return tmp;
		}
	}

	private T removeAfter(Node<T> before) {
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

	private Node<T> getNode(int index) {
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
