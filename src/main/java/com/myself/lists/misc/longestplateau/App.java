package com.myself.lists.misc.longestplateau;

public class App {
    public static void main(String[] args) {


        int[][] tabs = {
                new int[]{1,1,2,3,3,3,4,4,5,5,5,5,3},
                new int[]{1,1,1,1,1,1},
                new int[]{1,1,2,1,1},
                new int[]{1,2},
                new int[]{1},
                new int[]{}
        };
        for(int i = 0; i < tabs.length; i++) {
            Plateau p = new Plateau(tabs[i]);
            p.findLongest();
            System.out.println(p);
        }


    }


}
