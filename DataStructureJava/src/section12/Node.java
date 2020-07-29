package section12;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제4-1장: 연결리스트의 개념과 기본연산
public class Node<T> {
	public T data;
	public Node<T> next;

	public Node(T item) {
		data = item;
		next = null;
	}
}
