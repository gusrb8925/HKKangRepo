package section11;

import java.util.Arrays;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제3-5장: Generic 프로그래밍과 Generics 2
public class MyArrayList<E> { // <E> type parameter

	private static final int INIT_CAPACITY = 10;
	private E[] theData;
	private int size;
	private int capacity;

	// 생성자
	public MyArrayList() {
		// theData = new E[INIT_CAPACITY]; //new 다음에는 type parameter불가
		theData = (E[]) new Object[INIT_CAPACITY];
		size = 0;
		capacity = INIT_CAPACITY;
	}

	public E remove(int index) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		E returnValue = theData[index];
		for (int i = index + 1; i < size; i++) {
			theData[i - 1] = theData[i];
		}
		size--;
		return returnValue;
	}

	public E get(int index) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return theData[index];
	}

	public E set(int index, E newValue) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		E oldValue = theData[index];
		theData[index] = newValue;
		return oldValue;
	}

	public int indexOf(E anEntry) {
		for (int i = 0; i < size; i++) {
			if (theData[i].equals(anEntry)) { // Object 클래스 상속, 의도대로 작동할려면 override필수
				return i;
			}
		}
		return -1;
	}

	public int size() {
		return size;
	}

	public void add(int index, E anEntry) {
		if (index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException(index); // 캐치볼시작
		}
		if (size >= capacity) {
			reallocate();
		}
		for (int i = size - 1; i >= index; i--) {
			theData[i + 1] = theData[i];
		}
		theData[index] = anEntry;
		size++;
	}

	private void reallocate() {
		capacity *= 2;
		theData = Arrays.copyOf(theData, capacity); // 3번쨰 방법/ 1.for문으로 복사 2.System.arraycopy(복사할 배열, 0, 임시배열, 0, 배열길이);
													// 2번쨰 방법 sec10_2 ShapeApp참조
	}

	public void add(E enEntry) {
		add(size, enEntry);
	}
}
