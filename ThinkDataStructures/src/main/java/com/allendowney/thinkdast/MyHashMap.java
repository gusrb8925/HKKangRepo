package com.allendowney.thinkdast;

import java.util.Map;

/**
 * Implementation of a HashMap using a collection of MyLinearMap and
 * resizing when there are too many entries.
 *
 * @param <K>
 * @param <V>
 */
public class MyHashMap<K, V> extends MyBetterMap<K, V> implements Map<K, V> {

    // 재해시하기 전 하위 맵당 평균 엔트리 개수
    protected static final double FACTOR = 1.0;

    @Override
    public V put(K key, V value) {
        V oldValue = super.put(key, value);

        // 하위 맵당 엔트리의 개수가 임계치를 넘지 않는지 확인
        if (size() > maps.size() * FACTOR) {
            rehash();
        }
        return oldValue;
    }

    /**
     * Doubles the number of maps and rehashes the existing entries.
     */
    protected void rehash() {
        // TODO: FILL THIS IN!
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new MyHashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(Integer.toString(i), i);
        }
        Integer value = map.get("3");
        System.out.println(value);
    }
}
