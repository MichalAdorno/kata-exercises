package com.myself.sorting;


import com.myself.sorting.heapsort.HeapSort;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Integer> sorted = HeapSort.sort(Arrays.asList(5, 6, 7, 1, 2, 3, 4, 5));

        System.out.println(sorted);

    }

}
