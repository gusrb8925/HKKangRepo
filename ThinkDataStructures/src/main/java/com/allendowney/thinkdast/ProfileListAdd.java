package com.allendowney.thinkdast;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.jfree.data.xy.XYSeries;

import com.allendowney.thinkdast.Profiler.Timeable;

public class ProfileListAdd {

    public static void main(String[] args) {
//        profileArrayListAddEnd();
//        profileArrayListAddBeginning();
        profileLinkedListAddBeginning();
//        profileLinkedListAddEnd();
    }

    /**
     * Characterize the run time of adding to the end of an ArrayList
     */
    public static void profileArrayListAddEnd() {
        // porfiler 클래스 사용하려면 setup, timeMe 메서드를 제공하는 Timeable 객체 생성 필요
        Timeable timeable = new Timeable() {
            List<String> list;

            public void setup(int n) {
                // 시간 측정 시작전에 빈 리스트 만들기
                list = new ArrayList<>();
            }

            public void timeMe(int n) {
                // 측정 작업
                for (int i = 0; i < n; i++) {
                    list.add("a string");
                }
            }
        };
        int startN = 4000; // 시간 측정을 시작하는 n 값
        int endMillis = 1000; // 임계치 지정
        runProfiler("ArrayList add end", timeable, startN, endMillis);
    }

    /**
     * Characterize the run time of adding to the beginning of an ArrayList
     */
    public static void profileArrayListAddBeginning() {
        // porfiler 클래스 사용하려면 setup, timeMe 메서드를 제공하는 Timeable 객체 생성 필요
        Timeable timeable = new Timeable() {
            List<String> list;

            public void setup(int n) {
                // 시간 측정 시작전에 빈 리스트 만들기
                list = new ArrayList<>();
            }

            public void timeMe(int n) {
                // 측정 작업
                for (int i = 0; i < n; i++) {
                    list.add(0, "a string");
                }
            }
        };
        int startN = 4000; // 시간 측정을 시작하는 n 값
        int endMillis = 1000; // 임계치 지정
        runProfiler("ArrayList add beginning", timeable, startN, endMillis);
    }

    /**
     * Characterize the run time of adding to the beginning of a LinkedList
     */
    public static void profileLinkedListAddBeginning() {
        // porfiler 클래스 사용하려면 setup, timeMe 메서드를 제공하는 Timeable 객체 생성 필요
        Timeable timeable = new Timeable() {
            List<String> list;

            public void setup(int n) {
                // 시간 측정 시작전에 빈 리스트 만들기
                list = new LinkedList<>();
            }

            public void timeMe(int n) {
                // 측정 작업
                for (int i = 0; i < n; i++) {
                    list.add(0, "a string");
                }
            }
        };
        int startN = 4000; // 시간 측정을 시작하는 n 값
        int endMillis = 1000; // 임계치 지정
        runProfiler("LinkedList add beginning", timeable, startN, endMillis);
    }

    /**
     * Characterize the run time of adding to the end of a LinkedList
     */
    public static void profileLinkedListAddEnd() {
        // porfiler 클래스 사용하려면 setup, timeMe 메서드를 제공하는 Timeable 객체 생성 필요
        Timeable timeable = new Timeable() {
            List<String> list;

            public void setup(int n) {
                // 시간 측정 시작전에 빈 리스트 만들기
                list = new LinkedList<>();
            }

            public void timeMe(int n) {
                // 측정 작업
                for (int i = 0; i < n; i++) {
                    list.add("a string");
                }
            }
        };
        int startN = 4000; // 시간 측정을 시작하는 n 값
        int endMillis = 1000; // 임계치 지정
        runProfiler("LinkedList add end", timeable, startN, endMillis);
    }

    /**
     * Runs the profiles and displays results.
     */
    private static void runProfiler(String title, Timeable timeable, int startN, int endMillis) {
        Profiler profiler = new Profiler(title, timeable);
        XYSeries series = profiler.timingLoop(startN, endMillis);
        profiler.plotResults(series);
    }
}