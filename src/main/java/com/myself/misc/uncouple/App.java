package com.myself.misc.uncouple;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>(Arrays.asList("red", "blue", "green", "green", "blue", "red", "yellow"));
        List<String> uncoupled = uncouple(list);
        System.out.println(uncoupled);
    }

    public static List<String> uncouple(List<String> list){
        List<String> candidate = new LinkedList<>(list);
        int i = 0;
        while(i < candidate.size()){
            if(existsCoupleAt(candidate, i)){
                removeCoupleAt(candidate, i);
                i = 0;
            } else {
                i++;
            }
        }
        return candidate;
    }

    private static boolean existsCoupleAt(List<String> list, int i) {
        if(i + 1 < list.size() && list.get(i).equals(list.get(i + 1)))
            return true;
        return false;
    }

    private static void removeCoupleAt(List<String> list, int i){
        list.remove(i);
        list.remove(i);
    }

}
