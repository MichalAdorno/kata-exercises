package com.myself.heaps;


import java.util.List;

public interface HeapIntf<T extends Comparable<T>> {

    T getRoot();

    int size();

    T getParentOf(int i);

    T getLeftChildOf(int i);

    T getRightChildOf(int i);

    void heapify();

    void buildHeapFromArray(List<T> array);

    T pop();

    void push(T elem);

    void ofUnsafe(List<T> array);

    boolean hasHeapProperty();
}
