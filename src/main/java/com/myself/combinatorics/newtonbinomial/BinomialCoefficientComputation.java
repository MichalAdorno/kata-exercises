package com.myself.combinatorics.newtonbinomial;

import java.util.Deque;
import java.util.LinkedList;

public class BinomialCoefficientComputation {

    private static int LIMIT = 1_000_000_000;

    public int solution(int N, int L) {
        if (N < 0 || L < 0 || N < L) {
            return -1;
        }
        if (L >= 1 && N >= LIMIT) {
            return -1;
        }
        if ((L == 1 || L == N) && N >= LIMIT) {
            return -1;
        }
        if (L == 0 || L == N) {
            return 1;
        }

        int K = Math.min(L, N - L);
        int result = N;
        Deque<Integer> queueK = new LinkedList<>();
        for (int k = 2; k <= K; k++) {
            queueK.addLast(k);
        }

        for (int n = N - K + 1; n < N; n++) {
            final int temp = result * n;
            if (!queueK.isEmpty()) {
                int firstFirst = queueK.getFirst();

                while (temp % queueK.getFirst() != 0) {
                    Integer first = queueK.removeFirst();
                    queueK.addLast(first);
                    if (firstFirst == queueK.getFirst()) {
                        break;
                    }
                }
                if (temp % queueK.getFirst() == 0) {
                    result = temp / queueK.removeFirst();
                } else {
                    result = temp;
                }
            } else {
                result = temp;
            }

            if (result > LIMIT || result < 0) {
                return -1;
            }
        }
        return result;
    }

}
