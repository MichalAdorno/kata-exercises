package com.myself.searching.bitonic;


import java.util.Arrays;

public class BitonicSearch {

    public int positionOfMax = -2;
    public int[] tab;
    public BitonicSearch(int[] tab) {this.tab = tab;}

    public void findMax() {

        int left = 0;
        int right = tab.length - 1;

        if (right < 0){
            positionOfMax = -1;
            return;
        }
        if(right == 0){
            positionOfMax = 0;
            return;
        }

        while(left < right) {
            int mid = (left + right) / 2;

            if (tab[mid] > tab[mid + 1]){
                positionOfMax = mid;
                return;
            }
            if(tab[left] <= tab[mid]){
                left = mid + 1;
            } else {
                right = mid;
            }
        }


        if(tab[right] >= tab[right - 1]) {
            positionOfMax = right;
            return;
        }
//        positionOfMax = left;

    }

    @Override
    public String toString() {
        return "Max at: " + positionOfMax + " in: " + Arrays.toString(tab);
    }
}
