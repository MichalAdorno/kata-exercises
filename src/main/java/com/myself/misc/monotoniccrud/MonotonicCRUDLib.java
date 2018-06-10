package com.myself.misc.monotoniccrud;


import com.google.common.primitives.Ints;

import java.util.LinkedList;
import java.util.List;

public class MonotonicCRUDLib {

    //assume all arrays are sorted in the increasing order

    public static int[] union(int[] a, int[] b){
        int ia = 0;
        int ib = 0;
        int na = a.length;
        int nb = b.length;
        List<Integer> cl = new LinkedList<>();

        while(ia < na && ib < nb){
            if(a[ia] <= b[ib]){
                cl.add(a[ia]);
                ia++;
            } else if(a[ia] > b[ib]) {
                cl.add(b[ib]);
                ib++;
            }
        }

        while(ia < na){
            cl.add(a[ia]);
            ia++;
        }

        while(ib < nb){
            cl.add(b[ib]);
            ib++;
        }

        return Ints.toArray(cl);
    }

    public static int[] unionNoDups(int[] a, int[] b){
        int ia = 0;
        int ib = 0;
        int na = a.length;
        int nb = b.length;
        List<Integer> cl = new LinkedList<>();

        while(ia < na && ib < nb){
            if(a[ia] == b[ib]){
                if(!equalToPrevious(a, ia))
                    cl.add(a[ia]);
                ia++;
                ib++;
            } else if(a[ia] < b[ib]) {
                if(!equalToPrevious(a, ia))
                    cl.add(a[ia]);
                ia++;
            } else if(a[ia] > b[ib]) {
                if(!equalToPrevious(b, ib))
                    cl.add(b[ib]);
                ib++;
            }
        }

        while(ia < na){
            if(!equalToPrevious(a, ia))
                cl.add(a[ia]);
            ia++;
        }

        while(ib < nb){
            if(!equalToPrevious(b, ib))
                cl.add(b[ib]);
            ib++;
        }

        return Ints.toArray(cl);
    }

    private static boolean equalToPrevious(int[] tab, int i) {
        if(i == 0)
            return false;
        else if(tab[i] == tab[i - 1])
            return true;
        else
            return false;
    }

    public static int[] intersection(int[] a, int[] b){
        int ia = 0;
        int ib = 0;
        int na = a.length;
        int nb = b.length;
        List<Integer> cl = new LinkedList<>();

        while(ia < na && ib < nb){
            while(ia < na && ib < nb){
                if(a[ia] == b[ib]){
                    if(!equalToPrevious(a, ia))
                        cl.add(a[ia]);
                    ia++;
                    ib++;
                } else if(a[ia] < b[ib]) {
                    ia++;
                } else if(a[ia] > b[ib]) {
                    ib++;
                }
            }
        }

        return Ints.toArray(cl);
    }

    public static int[] minus(int[] a, int[] b){
        int ia = 0;
        int ib = 0;
        int na = a.length;
        int nb = b.length;
        List<Integer> cl = new LinkedList<>();

        while(ia < na && ib < nb){
            if(a[ia] == b[ib]){
                ia++;
                ib++;
            } else if(a[ia] < b[ib]) {
                if(!equalToPrevious(a, ia))
                    cl.add(a[ia]);
                ia++;
            } else if(a[ia] > b[ib]) {
                ib++;
            }
        }

        while(ia < na){
            if(!equalToPrevious(a, ia))
                cl.add(a[ia]);
            ia++;
        }

        return Ints.toArray(cl);
    }


}
