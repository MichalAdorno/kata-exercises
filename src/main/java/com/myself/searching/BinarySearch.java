package com.myself.searching;



public class BinarySearch {

    public enum FIRST_FROM {LEFT, RIGHT};

    int search(int values[], int target) {
        return search(values, 0, values.length - 1, target);
    }

    int search(int values[], int left, int right, int target) {

        while (left < right) {
            int mid = (left + right) / 2;
            if (target <= values[mid]) {
                right = mid;
            } else if (target > values[mid]){
                left = mid + 1;
            }
        }
        if(values[left] == target)
            return left;
        else
            return -1;
    }

    int searchFirstFrom(int values[], int target, FIRST_FROM firstFrom) {
        return searchFirstFrom(values, 0, values.length - 1, target, firstFrom);
    }

    int searchFirstFrom(int values[], int left, int right, int target, FIRST_FROM firstFrom) {

        while (left < right) {
            int mid;
            switch(firstFrom){
                case LEFT:
                    mid = (left + right) / 2;
                    if (target <= values[mid]) {
                        right = mid;
                    } else {
                        left = mid + 1;
                    }
                    break;
                case RIGHT:
                    mid = (left + right + 1) / 2;
                    if (target < values[mid]) {
                        right = mid - 1;
                    } else {
                        left = mid;
                    }
                    break;
            }
        }
        if(values[left] == target)
            return left;
        else
            return -1;
    }

    int occures(int[] values, int target){
        int right = searchFirstFrom(values, target, FIRST_FROM.RIGHT);
        int left = searchFirstFrom(values, target, FIRST_FROM.LEFT);
        if(left >= 0)
            return (1 + right - left);
        else
            return 0;
    }
    int findValueEqualToIndex(int[] values){
        if(values.length == 0)
            return -1;



        return 0;
    }
}