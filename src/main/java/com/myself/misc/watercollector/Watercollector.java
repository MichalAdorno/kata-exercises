package com.myself.misc.watercollector;

import java.util.List;

public class Watercollector {

    public int howMuchWaterIsCollected(List<Integer> arr) {
        if (arr == null || arr.size() <= 1) {
            return 0;
        }
        int lH = lowToHigh(arr);
        int hL = highToLow(arr);
        /////////////////
        System.out.println("low to high and equal to equal = " + lH);
        System.out.println("high to low = " + hL);
        return lH + hL;
    }

    public int highToLow(List<Integer> arr) {
        //high->low with equal
        int i = arr.size() - 1;
        int j = arr.size() - 2;
        int temp = 0;
        int acc = 0;
        while (i >= 0 && j >= 0) {
            if (arr.get(j) < arr.get(i)) {
                temp = temp + (arr.get(i) - arr.get(j));
            }
            if (arr.get(j) > arr.get(i)) {
                acc = acc + temp;
                temp = 0;
                i = j;
                j = i - 1;
            } else {
                j--;
            }
        }
        return acc;
    }

    public int lowToHigh(List<Integer> arr) {
        //low->high
        int acc = 0;
        int i = 0;
        int j = 1;
        int temp = 0;
        while (i < arr.size() && j < arr.size()) {
            if (arr.get(i) >= arr.get(j)) {
                temp = temp + (arr.get(i) - arr.get(j));
            }
            if (arr.get(i) <= arr.get(j)) {
                acc = acc + temp;
                temp = 0;
                i = j;
                j = i + 1;
            } else {
                j++;
            }
        }
        return acc;
    }
}
