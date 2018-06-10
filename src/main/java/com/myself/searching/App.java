package com.myself.searching;


public class App {
    public static void main(String[] args) {

        BinarySearch s = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        presentResult(0, s.search(arr, 0));
        presentResult(2, s.search(arr, 2));
        presentResult(10, s.search(arr, 10));
        presentResult(11, s.search(arr, 11));
        presentResult(100, s.search(arr, 100));


        int arr2[] = {2, 3, 4, 10};
        presentResult(0, s.search(arr2, 0));
        presentResult(2, s.search(arr2, 2));
        presentResult(10, s.search(arr2, 10));
        presentResult(11, s.search(arr2, 11));

        int arr3[] = {2};
        presentResult(0, s.search(arr3, 0));
        presentResult(2, s.search(arr3, 2));
        presentResult(10, s.search(arr3, 10));

        int arr4[] = {1,2,2,3};
        presentResult(0, s.searchFirstFrom(arr4, 0, BinarySearch.FIRST_FROM.LEFT));
        presentResult(0, s.searchFirstFrom(arr4, 0, BinarySearch.FIRST_FROM.RIGHT));
        presentResult(1, s.searchFirstFrom(arr4, 1, BinarySearch.FIRST_FROM.LEFT));
        presentResult(1, s.searchFirstFrom(arr4, 1, BinarySearch.FIRST_FROM.RIGHT));
        presentResult(2, s.searchFirstFrom(arr4, 2, BinarySearch.FIRST_FROM.LEFT));
        presentResult(2, s.searchFirstFrom(arr4, 2, BinarySearch.FIRST_FROM.RIGHT));
        presentResult(3, s.searchFirstFrom(arr4, 3, BinarySearch.FIRST_FROM.LEFT));
        presentResult(3, s.searchFirstFrom(arr4, 3, BinarySearch.FIRST_FROM.RIGHT));
        presentResult(20, s.searchFirstFrom(arr4, 20, BinarySearch.FIRST_FROM.LEFT));
        presentResult(20, s.searchFirstFrom(arr4, 20, BinarySearch.FIRST_FROM.RIGHT));

        System.out.println(String.format("Found %d occurrence(s) of %d", s.occures(arr4, -6), -6));
        System.out.println(String.format("Found %d occurrence(s) of %d", s.occures(arr4, 2), 2));
        System.out.println(String.format("Found %d occurrence(s) of %d", s.occures(arr4, 3), 3));
        System.out.println(String.format("Found %d occurrence(s) of %d", s.occures(arr4, 6), 6));
    }

    public static void presentResult(int value, int result) {
        if (result == -1)
            System.out.println(String.format("Element %d not present", value));
        else
            System.out.println(String.format("Element %d found at index %d", value, result));
    }
}
