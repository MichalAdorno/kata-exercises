package com.myself.lists.misc.longestplateau;


import java.util.Arrays;
import java.util.Collections;

public class Plateau {
    public int startOfLongest = 0;
    public int lengthOfLongest = 1;
    public int[] tab;
    public Plateau(int[] tab) { this.tab = tab;}

    public void findLongest(){
        if(tab.length == 0){
            this.startOfLongest = 0;
            this.lengthOfLongest = 0;
            return;
        }

        int startOfLongest = 0;
        int lengthOfLongest = 1;

        int startOfActual = 0;
        int lengthOfActual = 0;

        for(int i = 0; i < tab.length; i++){
            if(onTheSamePlateau(tab, i)){
                lengthOfActual++;
            } else { //new plateau
                if(lengthOfActual > lengthOfLongest) {
                    lengthOfLongest = lengthOfActual;
                    startOfLongest = startOfActual;
                }
                startOfActual = i;
                lengthOfActual = 1;

            }
        }

        this.lengthOfLongest = lengthOfLongest;
        this.startOfLongest = startOfLongest;

    }

    private boolean onTheSamePlateau(int[] tab, int i){
        if(tab.length == 1 || i == 0)
            return true;
        else
            return (tab[i] == tab[i-1]);
    }

    @Override
    public String toString() {
        return "In: " + Arrays.toString(tab) +
                " the longest plateau starts at: " + startOfLongest +
                ", and has length of: " + lengthOfLongest;
    }
}
