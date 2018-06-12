package com.myself.misc.ringsofnumbers;

import java.util.Arrays;
import java.util.Comparator;


public class ArrayRing {

    public int max;
    public int[][] rings;

    public ArrayRing(int max){
        this.max = max;
        this.rings = populate(max);
    }

    public String toString() {
        StringBuilder representation = new StringBuilder("");
        for(int i = 0; i < rings.length; i++)
            representation.append("\n").append(Arrays.toString(rings[i]));

        return representation.toString();
    }

    private int longest(){
        return Arrays.stream(rings)
                .flatMapToInt(Arrays::stream)
                .mapToObj(String::valueOf)
                .map(String::length)
                .max(Comparator.naturalOrder())
                .orElse(10); //lol
    }

    public static int[][] populate(int max){
        int[][] rings = createEmptyRing(max);
        //---
        for(int i = 1; i <= max; i++)
            populateSingleRing(rings, i);
        //---
        return rings;
    }

    private static int[][] createEmptyRing(int max){
        return new int[2 * max - 1][2 * max - 1];
    }

    public static void populateSingleRing(int[][] rings, int i){
        int ix = i - 1;
        int n = rings.length;
        while(i - 1 <= ix && ix < (n - i + 1)){
            rings[ix][i - 1] = i;
            rings[i - 1][ix] = i;
            rings[ix][n - i] = i;
            rings[n - i][ix] = i;
            ix++;

        }
    }
}
