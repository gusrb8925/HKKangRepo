package com.allendowney.thinkdast;

import java.util.ArrayList;

import org.junit.Before;

public class MyLinkedListTest extends MyArrayListTest {

    @Before
    public void setUp() throws Exception {
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        mylist = new MyLinkedList<>();
        mylist.addAll(list);
    }
}
