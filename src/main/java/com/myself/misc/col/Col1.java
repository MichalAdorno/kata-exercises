package com.myself.misc.col;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Col1 {

    public List<Boolean> predicate(List<Integer> A) {
        if (A == null || A.size() == 1) {
            return null;
        }

        List<Integer> counts = new ArrayList<>(A.size());
        List<Boolean> predicated = new ArrayList<>(A.size());

        for (int i = 0; i < A.size(); i++) {
            counts.add(0);
            predicated.add(false);
        }

        for (int j = 0; j < A.size(); j++) {
            int i = A.get(j);
            if (0 <= i && i < A.size()) {
                if (i < j) counts.set(i, counts.get(i) + 1);
                if (i > j) counts.set(i, counts.get(i) + 1);
            }
        }
        for (int i = 0; i < A.size(); i++) {

            if (counts.get(i) > 1) {
                predicated.set(i, true);
            }
        }
        return predicated;
    }

    public List<Boolean> control(List<Integer> A) {
        if (A == null || A.size() == 0) {
            return null;
        }

        int[] C = new int[A.size()];
        Boolean[] B = new Boolean[A.size()];

        for (int i = 0; i < A.size(); i++) {
            B[i] = false;
            C[i] = -1;
        }

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) > i && A.get(i) < A.size()) {
                if (C[A.get(i)] == 0) C[A.get(i)] = i;
            }
        }

        for (int i = A.size() - 1; i >= 0; i--) {
            if (A.get(i) < i && A.get(i) >= 0) {
                if (C[A.get(i)] >= 0) B[A.get(i)] = true;
            }
        }

        return Arrays.asList(B);
    }

}