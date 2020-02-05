package com.myself.misc.countcountries;

public class RecursiveCountryCounter {

    public int countCountries(int[][] A) {
        if (A == null) {
            return 0;
        }
        int N = A.length;
        if (N == 0 || A[0] == null) {
            return 0;
        }
        int M = A[0].length;
        if (M == 0) {
            return 0;
        }

        boolean[][] V = new boolean[N][M]; //all false
        int numOfCountries = 0;
        for (int iN = 0; iN < N; iN++) {
            for (int iM = 0; iM < M; iM++) {
                if (!V[iN][iM]) { //not visited
                    int color = A[iN][iM];
                    V[iN][iM] = true;
                    determineCountry(iN, iM, A, V, color);
                    numOfCountries++;
                }
            }
        }
        return numOfCountries;
    }

    private void determineCountry(int iN, int iM, int[][] A, boolean[][] V, int color) {
        if (color == A[iN][iM]) {
            V[iN][iM] = true;
            if (isNotVisited(iN - 1, iM, A, V, color)) determineCountry(iN - 1, iM, A, V, color);
            if (isNotVisited(iN + 1, iM, A, V, color)) determineCountry(iN + 1, iM, A, V, color);
            if (isNotVisited(iN, iM - 1, A, V, color)) determineCountry(iN, iM - 1, A, V, color);
            if (isNotVisited(iN, iM + 1, A, V, color)) determineCountry(iN, iM + 1, A, V, color);

        }
    }

    private boolean isNotVisited(int i, int j, int[][] A, boolean[][] V, int color) {
        return 0 <= i && 0 <= j
                && i < A.length && j < A[0].length
                && !V[i][j]
                && color == A[i][j];
    }

}
