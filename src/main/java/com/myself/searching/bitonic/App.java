package com.myself.searching.bitonic;


public class App {
    public static void main(String[] args) {

        int[][] tabs = {
                new int[]{4,5,5,5,5,1,1,2,3,3,3,4},
                new int[]{4,1,1,2,3,3,3,4},
                new int[]{1,1,1,1,1,1},
                new int[]{1,1,2,0,1},
                new int[]{1,2,2,3},
                new int[]{1,2},
                new int[]{1},
                new int[]{},
                new int[]{4,5,0,0,1,1,2},

        };
        for(int i = 0; i < tabs.length; i++){
            BitonicSearch bs = new BitonicSearch(tabs[i]);
            bs.findMax();
            System.out.println(bs);
        }

    }
}
