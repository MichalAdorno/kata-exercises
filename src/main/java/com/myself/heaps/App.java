package com.myself.heaps;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1));
        Integer root;
        Heap<Integer> heap = new Heap<>();
        Heap<Integer> invalidHeap = new Heap<>();
        heap.ofUnsafe(array);

        //---
        System.out.printf("****************\n");
        System.out.printf("Initial heap: %15s\n", heap);
        System.out.printf("%15s has the heap property: %b\n", heap, heap.hasHeapProperty());

        //---
        root = heap.pop();
        System.out.printf("****************\n");
        System.out.printf("After pop(): %15s\n", heap);
        System.out.printf("Removed element: %s\n", root);
        System.out.printf("%15s has the heap property: %b\n", heap, heap.hasHeapProperty());

        //---
        root = heap.pop();
        System.out.printf("****************\n");
        System.out.printf("After pop(): %15s\n", heap);
        System.out.printf("Removed element: %s\n", root);
        System.out.printf("%15s has the heap property: %b\n", heap, heap.hasHeapProperty());

        //---
        root = heap.pop();
        System.out.printf("****************\n");
        System.out.printf("After pop(): %15s\n", heap);
        System.out.printf("Removed element: %s\n", root);
        System.out.printf("%15s has the heap property: %b\n", heap, heap.hasHeapProperty());

        //---
        root = 10;
        heap.push(root);
        System.out.printf("****************\n");
        System.out.printf("After pop(): %15s\n", heap);
        System.out.printf("Added element: %s\n", root);
        System.out.printf("%15s has the heap property: %b\n", heap, heap.hasHeapProperty());

        //---
        root = 100;
        heap.push(root);
        System.out.printf("****************\n");
        System.out.printf("After pop(): %15s\n", heap);
        System.out.printf("Added element: %s\n", root);
        System.out.printf("%15s has the heap property: %b\n", heap, heap.hasHeapProperty());

        //---
        invalidHeap.ofUnsafe(new ArrayList<>(Arrays.asList(8, 9, 7, 6, 10, 4, 3, 2, 1)));
        System.out.printf("****************\n");
        System.out.printf("%15s has the heap property: %b\n", invalidHeap, invalidHeap.hasHeapProperty());

        //---
        invalidHeap.restoreHeapProperty();
        System.out.printf("****************\n");
        System.out.printf("%15s has the heap property: %b\n", invalidHeap, invalidHeap.hasHeapProperty());

        //---
        invalidHeap.ofUnsafe(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
        System.out.printf("****************\n");
        System.out.printf("%15s has the heap property: %b\n", invalidHeap, invalidHeap.hasHeapProperty());
        invalidHeap.restoreHeapProperty();
        System.out.printf("%15s has the heap property: %b\n", invalidHeap, invalidHeap.hasHeapProperty());

        //---


    }
}
