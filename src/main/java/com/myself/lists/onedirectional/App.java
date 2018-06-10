package com.myself.lists.onedirectional;



public class App {
    public static void main(String[] args) {
        //---
        List<Integer> list = ListLib.createListFromArray(new Integer[]{1,2,3,4,5,6,7,8,9});
        //reverse
        System.out.println("list      = " + list);
        list = ListLib.reverse(list);
        System.out.println("reverse   = " + list);
        list = ListLib.reverse(list);
        System.out.println("reverse   = " + list);
        //remove
        list = ListLib.remove(list,6);
        System.out.println("remove(6) = " + list);
        list = ListLib.remove(list,1);
        System.out.println("remove(1) = " + list);
        list = ListLib.remove(list,9);
        System.out.println("remove(9) = " + list);
        list = ListLib.remove(list,9);
        System.out.println("remove(9) = " + list);
        //---
    }
}
