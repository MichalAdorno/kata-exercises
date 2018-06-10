package com.myself.arithmetics.binaryconversion;


import com.google.common.primitives.Ints;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;


public class App {

    public static void main(String[] args) {
        for(int i = 0; i <= 16; i++)
            System.out.println(String.format("%3d as binary is: %6s",i, convertToBinaryString(i)));
        for(int i = 0; i <= 16; i++)
            System.out.println(String.format("%3d as binary is: %16s",i, Arrays.toString(convertToBinary(i))));

    }
    public static String convertToBinaryString(int number) {
        StringBuilder result = new StringBuilder("");

        for (int d = number; d > 0; d /= 2) // d=d/2
            result.insert(0, d % 2);

        return (result.length() == 0) ? "0" : result.toString();
    }
    public static int[] convertToBinary(int number) {
        Deque<Integer> result = new LinkedList<>();
        for(int d = number; d > 0; d /= 2) // d=d/2
            result.addFirst(d % 2);

        return (result.isEmpty() ? new int[]{0} : Ints.toArray(result));
    }
}
