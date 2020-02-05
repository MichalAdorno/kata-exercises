package com.myself.misc.countcountries;

import java.util.Deque;
import java.util.LinkedList;

public class QueueingCountryCounter {

    public int countCountries(int[][] A) {

        if (A == null) {
            return 0;
        }
        if (A.length == 0) {
            return 0;
        }
        if (A[0].length == 0) {
            return 0;
        }

        Deque<Element> q = new LinkedList<>();
        int N = A.length;
        int M = A[0].length;
        boolean[][] V = new boolean[N][M];
        Integer counter = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!V[i][j]) {
                    q.addFirst(new Element(i, j, A[i][j]));
                    counter += determineRegion(A, i, j, q, V);
                }
            }
        }

        return counter;
    }

    private int determineRegion(int[][] A,
                                int i,
                                int j,
                                Deque<Element> q,
                                boolean[][] V) {
        while (!q.isEmpty()) {
            var chk = q.removeFirst();
            if (chk.color == A[i][j]) {
                V[chk.i][chk.j] = true;
                if (isOkAndNotVisited(chk.i - 1, chk.j, V))
                    q.addLast(new Element(chk.i - 1, chk.j, A[chk.i - 1][chk.j]));
                if (isOkAndNotVisited(chk.i + 1, chk.j, V))
                    q.addLast(new Element(chk.i + 1, chk.j, A[chk.i + 1][chk.j]));
                if (isOkAndNotVisited(chk.i, chk.j - 1, V))
                    q.addLast(new Element(chk.i, chk.j - 1, A[chk.i][chk.j - 1]));
                if (isOkAndNotVisited(chk.i, chk.j + 1, V))
                    q.addLast(new Element(chk.i, chk.j + 1, A[chk.i][chk.j + 1]));
            }
        }
        return 1;
    }

    private boolean isOkAndNotVisited(int i, int j, boolean[][] V) {
        return 0 <= i && 0 <= j
                && i < V.length && j < V[0].length
                && !V[i][j];
    }

    public void print(int[][] A) {
        System.out.println("***");
        for (int i = 0; i < A.length; i++) {
            System.out.println("");
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("***");
    }

    public class Element {
        int i;
        int j;
        int color;

        public Element(int i, int j, int color) {
            this.i = i;
            this.j = j;
            this.color = color;
        }
    }

}
