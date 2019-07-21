package com.myself.searching.antibitonic;

public class AntiBitonicBinarySearch {

    public int search(final int values[]) {

        int left = 0;
        int right = values.length - 1;

        if (right < left) {
            throw new IllegalArgumentException();
        }

        if (right - left <= 1) {
            return -1;
        }

        while (left < right) {
            int mid = (left + right) / 2;

            if (values[mid] < values[right]
                    && values[mid] < values[mid + 1]) {
                right = mid;

            } else if (values[left] >= values[mid]
                    && values[mid] > values[mid + 1]) {
                left = mid + 1;

            } else {
                return -1;
            }
        }
        if (left == 0 || left == values.length - 1) {
            return -1;
        }

        return values[left - 1] > values[left] && values[left] < values[left + 1]
                ? left
                : -1;
    }

}
