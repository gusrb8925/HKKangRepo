package com.allendowney.thinkdast;

import org.junit.Before;

public class MyFixedHashMapTest extends MyLinearMapTest {

    @Before
    public void setUp() throws Exception {
        map = new MyFixedHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put(null, 0);
    }
}
