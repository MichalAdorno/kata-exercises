package com.myself.arithmetics.binaryconversion;


public class App {

    public static void main(String[] args) {
        for(int i = 0; i < 33; i++)
            System.out.println(String.format("%3d as binary is: %6s",i, convertToBinaryString(i)));
    }
    public static String convertToBinaryString(int number) {
        String result = "";

        for(int d = number; d > 0; d /= 2) // d=d/2
            result = (d % 2) + result;
        return (result.equals("") ? "0" : result);
    }
}
