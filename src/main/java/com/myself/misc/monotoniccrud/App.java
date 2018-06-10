package com.myself.misc.monotoniccrud;


import java.util.Arrays;

import static com.myself.misc.monotoniccrud.MonotonicCRUDLib.*;

public class App {

    public static void main(String[] args) {
        int[] set11;
        int[] set12;
        int[] union1;
        //---------------------------------------------------------
        System.out.println("UNION - DUPLICATES ALLOWED");
        set11 = new int[]{1,20,30};
        set12 = new int[]{1,2,15,21,22,23};
        union1 = union(set11, set12);
        showResult(set11, set12, union1);
        //--------------------
        set11 = new int[]{1};
        set12 = new int[]{1,2,15,21,22,23};
        union1 = union(set11, set12);
        showResult(set11, set12, union1);
        //--------------------
        set11 = new int[]{10};
        set12 = new int[]{1,2,15,21,22,23};
        union1 = union(set11, set12);
        showResult(set11, set12, union1);
        //--------------------
        set11 = new int[]{30};
        set12 = new int[]{1,2,15,21,22,23};
        union1 = union(set11, set12);
        showResult(set11, set12, union1);
        //--------------------
        set11 = new int[]{1,2,2,2,2};
        set12 = new int[]{1,2,2,15,21,22,23};
        union1 = union(set11, set12);
        showResult(set11, set12, union1);
        //--------------------
        set11 = new int[]{1};
        set12 = new int[]{1};
        union1 = union(set11, set12);
        showResult(set11, set12, union1);
        //--------------------
        set11 = new int[]{10};
        set12 = new int[]{2};
        union1 = union(set11, set12);
        showResult(set11, set12, union1);
        //---------------------------------------------------------
        System.out.println("UNION - NO DUPLICATES ALLOWED");
        set11 = new int[]{1,20,30};
        set12 = new int[]{1,2,15,21,22,23};
        union1 = unionNoDups(set11, set12);
        showResult(set11, set12, union1);
        //--------------------
        set11 = new int[]{1};
        set12 = new int[]{1,2,15,21,22,23};
        union1 = unionNoDups(set11, set12);
        showResult(set11, set12, union1);
        //--------------------
        set11 = new int[]{10};
        set12 = new int[]{1,2,15,21,22,23};
        union1 = unionNoDups(set11, set12);
        showResult(set11, set12, union1);
        //--------------------
        set11 = new int[]{30};
        set12 = new int[]{1,2,15,21,22,23};
        union1 = unionNoDups(set11, set12);
        showResult(set11, set12, union1);
        //--------------------
        set11 = new int[]{1,2,2,2,2};
        set12 = new int[]{1,2,2,15,21,22,23};
        union1 = unionNoDups(set11, set12);
        showResult(set11, set12, union1);
        //--------------------
        set11 = new int[]{1};
        set12 = new int[]{1};
        union1 = unionNoDups(set11, set12);
        showResult(set11, set12, union1);
        //--------------------
        set11 = new int[]{10};
        set12 = new int[]{2};
        union1 = unionNoDups(set11, set12);
        showResult(set11, set12, union1);
        //--------------------
        set11 = new int[]{10,10};
        set12 = new int[]{2,2,10};
        union1 = unionNoDups(set11, set12);
        showResult(set11, set12, union1);
        //---------------------------------------------------------
        System.out.println("INTERSECTION");
        set11 = new int[]{10,10};
        set12 = new int[]{2,2,10};
        union1 = intersection(set11, set12);
        showResult(set11, set12, union1);
        //--------------------
        set11 = new int[]{10,10};
        set12 = new int[]{2,2,10,10};
        union1 = intersection(set11, set12);
        showResult(set11, set12, union1);
        //--------------------
        set11 = new int[]{10,10,15};
        set12 = new int[]{2,2,10,10,10,15};
        union1 = intersection(set11, set12);
        showResult(set11, set12, union1);
        //--------------------
        set11 = new int[]{10};
        set12 = new int[]{2};
        union1 = intersection(set11, set12);
        showResult(set11, set12, union1);
        //--------------------
        set11 = new int[]{10};
        set12 = new int[]{2};
        union1 = intersection(set11, set12);
        showResult(set11, set12, union1);
        //--------------------
        set11 = new int[]{10,20,30,40};
        set12 = new int[]{20,21,31,40};
        union1 = intersection(set11, set12);
        showResult(set11, set12, union1);
        //--------------------
        set11 = new int[]{1,1,1,1,1,1,1,20};
        set12 = new int[]{20};
        union1 = intersection(set11, set12);
        showResult(set11, set12, union1);
        //---------------------------------------------------------
        System.out.println("MINUS");
        set11 = new int[]{1,1,1,1,1,1,1,20};
        set12 = new int[]{20};
        union1 = minus(set11, set12);
        showResult(set11, set12, union1);
        //--------------------
        set11 = new int[]{1,1,1,1,1,1,1,20};
        set12 = new int[]{1,20};
        union1 = minus(set11, set12);
        showResult(set11, set12, union1);
        //--------------------
        set11 = new int[]{1,2,3,4};
        set12 = new int[]{2};
        union1 = minus(set11, set12);
        showResult(set11, set12, union1);
        //--------------------
        set11 = new int[]{1,2,3,4};
        set12 = new int[]{5};
        union1 = minus(set11, set12);
        showResult(set11, set12, union1);
        //--------------------
        set11 = new int[]{1,2,3,4};
        set12 = new int[]{1,2,3,4};
        union1 = minus(set11, set12);
        showResult(set11, set12, union1);
        //--------------------
        set11 = new int[]{1};
        set12 = new int[]{1};
        union1 = minus(set11, set12);
        showResult(set11, set12, union1);
        //---------------------------------------------------------
    }

    public static void showResult(int[] a, int[] b, int[] c){
        System.out.println(String.format("%30s + %30s = %-60s", Arrays.toString(a), Arrays.toString(b), Arrays.toString(c)));
    }

}
