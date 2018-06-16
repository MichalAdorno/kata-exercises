package com.myself.sorting.heapsort;


import com.myself.heaps.Heap;

import java.util.List;

public class HeapSort {

    public static <T extends Comparable<T>> List<T> sort(List<T> list){

        Heap<T> heap = new Heap<>();
        heap.buildHeapFromArray(list);

        for(int size = heap.getSize() - 1; size >= 0; size--){
            T max = heap.pop();
        }

        return heap.getInternalArray();

    }


}
