package com.myself.misc.floydtriangle;


import com.google.common.base.Preconditions;

public class App {

    public static void main(String[] args) {
        printFloydTriangle(10);
    }

    public static void printFloydTriangle(int level){
        Preconditions.checkArgument(level > 0);
        int acc = 0;
        for(int l = 1; l <= level; l++){
            for(int i = 1; i <= l; i++){
                acc++;
                System.out.printf("%4s ", acc);
            }
            System.out.println("");
        }
    }
}
