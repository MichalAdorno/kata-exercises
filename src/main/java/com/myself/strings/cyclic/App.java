package com.myself.strings.cyclic;

public class App {

    public static void main(String[] args) {
        presentResult("aaabbb", "bbbaaa");
        presentResult("baaabb", "bbbaaa");
        presentResult("baaabbc", "bbbaaac");
        presentResult("bba", "bab");
        presentResult("abc", "acb");
        presentResult("abcd", "abc");

    }

    public static void presentResult(String source, String x){
        System.out.printf("Is [%8s] a cyclic transformation of [%8s]: %b\n", x, source, isCyclicTransformation(source, x));
    }

    public static boolean isCyclicTransformation(String source, String x){
        return (source.length() == x.length()) && (source + source).contains(x);
    }

}
