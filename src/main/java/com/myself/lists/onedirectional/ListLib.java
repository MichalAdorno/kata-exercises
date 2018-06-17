package com.myself.lists.onedirectional;


import java.util.Deque;

public class ListLib{

    public static <T extends Number> List<T> createListFromArray(T[] values){
        if(values == null)
            return null;
        List<T> elem = new List<>();
        List<T> head = elem;
        for(T value : values){
            List<T> act = new List<>(value);
            elem.setNext(act);
            //---
            elem = elem.getNext();
        }
        return head.getNext();
    }
    public static <T extends Number> List<T> reverse(List<T> list){
        List<T> head = null;
        List<T> iter = list;
        while(iter != null){
            List<T> elem = new List<>(iter.getValue());
            elem.setNext(head);
            head = elem;
            //---
            iter = iter.getNext();
        }
        return head;
    }
    public static <T extends Number> List<T> remove(List<T> list, T value){
        //0
        if(list == null){
            return null;
        }
        //1
        if(list.getNext() == null){
            return (list.getValue().equals(value)) ? null : list;
        }
        //>=2
        List<T> prev = new List<>();
        List<T> head = prev;
        List<T> current = list;
        while(current != null && !current.getValue().equals(value)){
            prev.setNext(current);
            prev = current;
            current = current.getNext();
        }
        //current == null || current.getValue.eq(value)
        if(current != null){
            prev.setNext(current.getNext());
        }

        return head.getNext();

    }

    public static <T extends Number> T kthToLast(List<T> list, int kth) {
        List<T> forrunner = list;
        int size = 0;
        while(forrunner != null){
            size++;
            forrunner = forrunner.getNext();
        }
        if(size < kth)
            return null;

        List<T> current = list;
        int i = 1;
        while(i <= size - kth){
            current = current.getNext();
            i++;
        }
        return current.getValue();

    }

    public static <T extends Number> boolean isPalindrome(List<T> list) {
        List<T> current = list;
        int size = 0;
        while(current != null){
            current = current.getNext();
            size++;
        }
        int mid = size / 2;
        int i = 0;
        current = list;
        List<T> reversed = reverse(list);
        while(i < mid){
            if(!list.getValue().equals(reversed.getValue()))
                return false;
            i++;
            list = list.getNext();
            reversed = reversed.getNext();
        }
        return true;
    }

}
