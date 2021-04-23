package com.allendowney.thinkdast;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @param <T>
 * @author downey
 */
public class MyArrayList<T> implements List<T> {
    int size;                    // 요소의 개수를 추적합니다.
    private T[] array;           // 요소를 저장합니다.

    @SuppressWarnings("unchecked")
    public MyArrayList() {
        // 자바는 다음과 같이 타입 피라미터로 배열을 초기화할 수 없습니다.
        // 예를 들어, 다음음 작동하지 않습니다.
        // array = new E[10];
        // 이러한 제약을 해결하려면 Object의 배열로 초기화하고 형변환을 해야 합니다.
        array = (T[]) new Object[10];
        size = 0;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // run a few simple tests
        MyArrayList<Integer> mal = new MyArrayList<Integer>();
        mal.add(1);
        mal.add(2);
        mal.add(3);
        System.out.println(Arrays.toString(mal.toArray()) + " size = " + mal.size);

        mal.remove(new Integer(2));
        System.out.println(Arrays.toString(mal.toArray()) + " size = " + mal.size);
    }

    @Override
    public boolean add(T element) {
        if (size >= array.length) {
            // 큰 배열을 만들고 요소들을 복사합니다.
            T[] bigger = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, bigger, 0, array.length);
            array = bigger;
        }
        array[size] = element;
        size++;
        return true;
    }

    @Override
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        // 크기 조정을 통해 요소를 추가합니다.
        add(element);

        // 다른 요소를 시프트합니다.
        for (int i = size - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        // 올바른 자리에 새로운 값을 넣습니다.
        array[index] = element;
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        boolean flag = true;
        for (T element : collection) {
            flag &= add(element);
        }
        return flag;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        // note: this version does not actually null out the references
        // in the array, so it might delay garbage collection.
        size = 0;
    }

    @Override
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        for (Object element : collection) {
            if (!contains(element)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public int indexOf(Object target) {
        for (int i = 0; i < size; i++) {
            if (equals(target, array[i])) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Checks whether an element of the array is the target.
     * <p>
     * Handles the special case that the target is null.
     *
     * @param target
     * @param element
     */
    private boolean equals(Object target, Object element) {
        if (target == null) {
            return element == null;
        } else {
            return target.equals(element);
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<T> iterator() {
        // make a copy of the array
        T[] copy = Arrays.copyOf(array, size);
        // make a list and return an iterator
        return Arrays.asList(copy).iterator();
    }

    @Override
    public int lastIndexOf(Object target) {
        // see notes on indexOf
        for (int i = size - 1; i >= 0; i--) {
            if (equals(target, array[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<T> listIterator() {
        // make a copy of the array
        T[] copy = Arrays.copyOf(array, size);
        // make a list and return an iterator
        return Arrays.asList(copy).listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        // make a copy of the array
        T[] copy = Arrays.copyOf(array, size);
        // make a list and return an iterator
        return Arrays.asList(copy).listIterator(index);
    }

    @Override
    public boolean remove(Object obj) {
        int index = indexOf(obj);
        if (index == -1) {
            return false;
        }
        remove(index);
        return true;
    }

    @Override
    public T remove(int index) {
        T element = get(index);
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return element;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        boolean flag = false;
        for (Object obj : collection) {
            flag |= remove(obj);
        }
        return flag;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T set(int index, T element) {
        T old = get(index); // 인덱스가 유효하지 않으면 예외를 던지는 get 메서드
        array[index] = element;
        return old;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex >= size || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException();
        }
        T[] copy = Arrays.copyOfRange(array, fromIndex, toIndex);
        return Arrays.asList(copy);
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(array, size);
    }

    @Override
    public <U> U[] toArray(U[] array) {
        throw new UnsupportedOperationException();
    }
}
