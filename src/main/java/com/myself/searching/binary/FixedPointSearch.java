package com.myself.searching.binary;

public class FixedPointSearch {

    public int search(final int values[]) {
        return search(values, 0, values.length - 1);
    }

    int search(final int values[], int left, int right) {

        while (left < right) {
            int mid = (left + right) / 2;
            if (values[mid] < mid) {
                left = mid + 1;

            } else if (mid <= values[mid]) {
                right = mid;
            }
        }
        return values[left] == left ? left : -1;
    }


}
