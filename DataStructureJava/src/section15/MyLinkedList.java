package section15;

import java.util.Iterator;
import java.util.ListIterator;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제4-4장: 이중연결리스트와 Iterator
//미완성
public class MyLinkedList<E> {

	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;

	// inner class
	private static class Node<T> {
		public T data;
		public Node<T> next;
		public Node<T> previous;

		public Node(T item) {
			data = item;
			next = null;
		}
	}

	public Iterator<E> iterator() {
		return new MyListIterator(0);
	}

	public ListIterator<E> listiterator() {
		return new MyListIterator(0);
	}

	public ListIterator<E> listiterator(int index) {
		return new MyListIterator(index);
	}

	// inner class
	private class MyListIterator implements ListIterator<E> {

		private Node<E> nextItem;
		private Node<E> lastItemReturned;
		private int index;

		public MyListIterator(int index) {

		}

		@Override
		public void add(E arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean hasPrevious() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public E next() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int nextIndex() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public E previous() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int previousIndex() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub

		}

		@Override
		public void set(E arg0) {
			// TODO Auto-generated method stub

		}

	}

	public int indexOf(E item) {
		return 0;
	}

	public void add(int index, E item) {

	}

	public E get(int index) {
		return null;
	}

	public boolean remove(int index) {
		return true;
	}

	public void remove(E obj) {

	}

	public int size() {
		return size;
	}

}
